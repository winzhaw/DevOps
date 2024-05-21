<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<script src="node_modules/chart.js/dist/chart.umd.js"></script>
<script src="node_modules/animejs/lib/anime.min.js"></script>
<title>DevOps Chart und Animation</title>
</head>
<body>
<canvas id="myChart" width="400" height="400"></canvas>
<!-- Hier können Sie ein Element für die Anime.js Animation hinzufügen -->
<div id="animeElement">DEV OPS</div>

<script>
// Hier Ihr Chart.js Code
// ...

// Hier Ihr Anime.js Code
anime({
  targets: '#animeElement',
  translateX: 250,
  rotate: '1turn',
  backgroundColor: '#FFF',
  duration: 800
});
</script>
</body>
</html>
