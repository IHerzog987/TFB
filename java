const quizForm = document.getElementById('quiz-form');
const resultsContainer = document.getElementById('results');
const resultText = document.getElementById('result-text');
const recommendations = document.getElementById('recommendations');

quizForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const q1 = parseInt(document.querySelector('input[name="q1"]:checked').value);
    const q2 = parseInt(document.querySelector('input[name="q2"]:checked').value);

    const totalScore = q1 + q2;

    resultsContainer.style.display = 'block';

    if (totalScore <= 4) {
        resultText.textContent = 'Your fridge is super clean! Keep up the good work!';
        recommendations.textContent = 'We recommend checking your fridge weekly for expired items to maintain its cleanliness.';
    } else if (totalScore <= 6) {
        resultText.textContent = 'Your fridge could use a little cleaning';
        recommendations.textContent = 'We recommend cleaning your fridge more frequently and checking for expired items weekly.';
    } else {
        resultText.textContent = 'Your fridge needs some serious cleaning';
        recommendations.textContent = 'We recommend cleaning your fridge immediately and checking for expired items daily.';
    }
});
