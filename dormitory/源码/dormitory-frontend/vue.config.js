// 跨域配置
module.exports = {

    publicPath: './',// vue-cli3.3+新版本使用

    devServer: {                
        // port: 9876,
        proxy: {                
            '/api': {              
                target: 'http://localhost:9090',     
                changeOrigin: true,           
                pathRewrite: {               
                    '^/api': ''                    
                }
            }
        }
    }
}

