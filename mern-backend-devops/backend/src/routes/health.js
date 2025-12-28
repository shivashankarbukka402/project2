const router = require('express').Router();

router.get('/', (req, res) => {
  res.json({ status: 'UP', service: 'backend' });
});

module.exports = router;
