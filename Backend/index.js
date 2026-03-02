const exp = require('express')
const app = exp()

app.get('/', (req,res)=>{
    return res.send('welcome in express js')
})

app.get('/getData' ,(req,res)=>{
    res.send()
})