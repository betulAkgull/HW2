package com.example.hw2

/*Bu ArrayList’i tipi CoinUI olan bir listeye dönüştürün ve konsola yazdırın.*/

data class CoinResponse(
    val name: String,
    val coinId: String,
    val hashingAlgorithm: String?,
    val description: String,
    val image: String,
    val currentPrice: Float,
    val priceChangePercentage24h: Float
)

data class CoinUI(val name: String, val coinId: String, val description: String, val image: String)

fun main() {
    val coinList = arrayListOf(
        CoinResponse(
            name = "Bitcoin",
            coinId = "BTC",
            hashingAlgorithm = "SHA-256",
            description = "Bitcoin is a decentralized digital currency, without a central bank or single administrator.",
            image = "https://example.com/bitcoin.png",
            currentPrice = 34789.21.toFloat(),
            priceChangePercentage24h = -2.34.toFloat()
        ),
        CoinResponse(
            name = "Ethereum",
            coinId = "ETH",
            hashingAlgorithm = "Ethash",
            description = "Ethereum is an open-source, blockchain-based platform that enables developers to build and deploy smart contracts.",
            image = "https://example.com/ethereum.png",
            currentPrice = 2110.45.toFloat(),
            priceChangePercentage24h = 0.78.toFloat()
        ),
        CoinResponse(
            name = "Litecoin",
            coinId = "LTC",
            hashingAlgorithm = "Scrypt",
            description = "Litecoin is a peer-to-peer cryptocurrency that enables instant, near-zero cost payments to anyone in the world.",
            image = "https://example.com/litecoin.png",
            currentPrice = 129.57.toFloat(),
            priceChangePercentage24h = -1.12.toFloat()
        ),
        CoinResponse(
            name = "Ripple",
            coinId = "XRP",
            hashingAlgorithm = null,
            description = "Ripple is a digital payment protocol and cryptocurrency that is designed to facilitate fast, low-cost international money transfers.",
            image = "https://example.com/ripple.png",
            currentPrice = 0.5483.toFloat(),
            priceChangePercentage24h = 1.45.toFloat()
        )
    )

    val coinUIList: List<CoinUI> = coinList.map { coinResponse ->
        CoinUI(
            name = coinResponse.name,
            coinId = coinResponse.coinId,
            description = coinResponse.description,
            image = coinResponse.image
        )
    }

    coinUIList.forEach { coinUI ->
        println("Name: ${coinUI.name}, Coin ID: ${coinUI.coinId}, Description: ${coinUI.description}, Image: ${coinUI.image}")
    }

}