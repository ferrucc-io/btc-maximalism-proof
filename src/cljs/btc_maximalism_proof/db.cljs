(ns btc-maximalism-proof.db)

(def default-db
  {:primitives [{:id 1
                 :title "Hard vs Easy"
                 :description "Money that is hard to create and censor is hard to come by. There’s already a lot of money that is easy to censor and easy to create (Paypal, Venmo, WePay, Transferwise etc..), so there's no need for other alternatives. The alternative that is needed has to have different characteristics: it has to be non dilutable and censorship resistant. These differences must be kept. Bitcoin doesn't have to have a friendly UX, customer support and fraud protection, those things already exist elsewhere."
                 :parent-a 0
                 :parent-b 0}
                {:id 2
                 :title "Coinbase & Blockchain"
                 :description [:div 
                               [:p "There’s nothing new in bitcoin, most of the technologies used in it are legacy."] 
                               [:p "The are only two new things in Bitcoin:"]
                                [:ul
                                 [:li "the Coinbase process"]
                                 [:li "Blockchain" ]
                                 ]
                                [:p "Blockchain is not a silver bullet, it makes systems worse, slower and less privacy friendly."]]
                 :parent-a 0
                 :parent-b 0}

                {:id 3
                 :title "Cloning Theorem"
                 :description [:div 
                                [:p "In FLOSS if a project is successful and there’s money to be made with it somebody will clone it. Because bitcoin software is free everyone will try to copy it."]
                               [:p "Every person that can create money will try to create money. So everybody will try to create their own scam coin."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 4
                 :title "Top VS Bottom"
                 :description [:div 
                               [:p "Complex systems are layered." ]
                               [:p "Infrastructures, languages and protocols are a base layers, where having competition isn't optimal."]
                               [:p "Products that compete are meant to stay in upper layers."]
                               [:p "Why? If you like video games you want competition between game studios. For video game it's great to have dynamic markets where leaders change every year or less"]
                               [:p "For consoles, you want to have some competition, but you don't want a market that is as fast paced"]
                               [:p "For 3D Game engines you want some competition, but also some standards that last years"]
                               [:p "For the gaming CPUs you don't want to drastic architecture changes for 10 years and hundreds of alternatives." ]
                               [:p "The free market at base layers converges to the use of one protocol, a common language."]
                               [:p "A good example is the Web. TCP/IP v4, was finalised in 1983, and the market refused changes since then. Even during the cold war we were using TCP/IP, even china with the great firewall is using it. This doesn’t mean the protocol is perfect, in fact it sucks."]
                               [:p "When trying to build Skype, developers realised TCP/IP wasn’t scalable enough, so they changed it, but the market refused it. And today any call we do we still use this ugly old protocol and it’s immutable. TCP/IP 6 exists, but in 20 years we haven’t been able to migrate to it. Only 20% of the internet is actually using it."]
                               [:p "Even for communication, right now we’re converging to the English language, even if it’s not my native language, even if it's not the most beatiful language. This is not because english is the best language, but because of network effects."]
                               [:p "But why does this have anything to do with money and value?"]
                               [:p "With money and value you want even more stability. You want to be able to store wealth for as long as you can, passing it along to the next generations."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 5
                 :title "Immaculate Conception"
                 :description [:div 
                               [:p "Bitcoin showed a degree of resistance to censorship that cannot be replicated because of the extraordinary uniqueness of the historical condition when it was conceived."]
                               [:p "Satoshi had an opsec and incentives that cannot be replicated"]
                               [:p "The historical context is also impossible to replicate"]
                               [:p "In 2009 someone could stay in the underground doing this kind of work because anarchist money was an experiment. At most 20 people in the whole wolrd were actively pursuing this since a decade."]
                               [:p "Failing."]
                               [:p "Any operation that now tries to do this, is under heavy scrutiny and has a larger risk of being compromised. Social attack vectors would be viable now, as more people care about this."]
                               [:p "It may not be enough though as Satoshi could be in a jail right now. But today it would be orders of magnitude harder than the original attempt."]
                               [:p "Satoshi’s incentives also weren’t about buying a Lamborghini in the next months. Satoshi didn’t ask “How can I get payed for the work I’m doing?”."] 
                               [:p "He didn’t create a newsletter and send out an email saying “Here’s an idea, a whitepaper, i can turn it into reality, but first wire me 20 million bucks”."]
                               [:p "He created the whitepaper, nobody cared, launched the software and then it started to work."] 
                               [:p "This doesn’t mean asking for money is evil. It’s just that the incentive structure satoshi had wasn’t strictly connected to monetization. He could afford to launch something because in his opinion the world needed something like that."]
                               [:p "Even if you try to do this today, people around you will know. And you will attract people with bad incentives, looking to make money with the \"Next Bitcoin\"."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 6
                 :title "Scam Definition"
                 :description "A scammer is someone that acquires money, wealth, power or fame by lying. While understanding they are lying or having enough information to realise so."
                 :parent-a 0
                 :parent-b 0}
                {:id 7
                 :title "Simplification Proviso"
                 :description [:div 
                               [:p "When you have to counteract social attacks it’s okay to reduce the nuances and oversimplify things. Creating a set of heuristics that are easy to communicate and use."]
                               [:p "eg. “You should not roll your own cryptography”"]
                               [:p "“Nigerian princes are scammers”"]]
                 :parent-a 0
                 :parent-b 0}
                {:id 8
                 :title "Populist Theory"
                 :description [:div 
                               [:p "Everyone will try to create a populistic conspiracy theory."]
                               [:p "Life is full of trade offs."]
                               [:p "Humans have a tendency of spreading the belief that tradeoffs are all created by evil people. Especially in economics there’s this idea that there is no scarcity. There's this widespread narrative: “You’re not poor because you’re not serving the market, you’re poor because there’s an evil group of people keeping you poor”"]
                               [:p "For instance, in Bitcoin, if you get bigger blocks, you also raise the synchronization costs."]
                               [:p "People will lie to you saying you can have things without any kind of sacrifice. You should expect this to happen in every complex field."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 9
                 :title "Social Layer"
                 :description [:div
                               [:p "Systems like bitcoin aren’t just software, they are social protocols."]
                               [:p "TCP/IP is the protocol of the internet because people people will choose browsers compatible with tcp/ip."]
                               [:p "Bitcoin has a social layer that can be attacked and damaged. It’s cheap and free to attack the social layer of bitcoin without spending any money."]
                               [:p "Social attacks are the easiest attack vector."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 10
                 :title "Inner Regulator"
                 :description [:div 
                               [:p "If we like freedom we shouldn't stop defending bitcoin from scams right?"] 
                               [:p "Since we want to get rid of external censorship, coercion and regulation it’s important to have strict self regulation."]
                               [:p "Being vocal about what’s a scam, a fraud, an attack or a bad actor doesn’t equate to wanting intervention from violent regulation. It’s the opposite."]
                               [:p "Bitcoin is about getting rid of large chunks of government and laws, so we'll need a lot of self discipline on a cultural level."]]
                 :parent-a 0
                 :parent-b 0}
                {:id 11
                 :title "Blockchain Fallacy"
                 :description [:div 
                               [:p"A Blockchain without characteristics similar to bitcoin doesn’t make sense. The blockchain is a data structure created to avoid double spend in an open system."] 
                               [:p "If you don’t have an open system you don’t need a blockchain."]
                               [:p "If you don’t have a double spending problem you don’t need blockchain."]
                               [:p "And POW blockchain works because there’s some kind of asset that incentivizes the opportunity cost of miners. Without Coinbase you don’t have any opportunity cost of mining on different histories so you wouldn’t have a unique history."] 
                               [:p "Blockchain makes sense to use only for something very similar to bitcoin. Anything that is not similar to bitcoin doesn’t need to use a blockchain."]]
                 :parent-a 1
                 :parent-b 2}
                {:id 12
                 :title "Supply Inflation"
                 :description [:div 
                               [:p "If everybody is incentived to create new copies of bitcoin then everybody will."]
                               [:p "If money was not hard to generate, then we’d have inflation in supply without any kind of predictable schedule."]
                               [:p "The schedule of cryptocurrencies is not predictable, as anyone can start a new one."]
                               [:p "And if it is not difficult to recreate the bitcoin features everybody will want to. And we’ll end up with infinite supply."]]
                 :parent-a 1
                 :parent-b 3}
                {:id 13
                 :title "King Plausibility"
                 :description [:div 
                               [:p "I don’t know if bitcoin can be the last one, but I know that because of its Immaculate conception and its being a \"bottom\" layer Bitcoin could have something which is not possible to replicate."]
                               [:p "And i know that if it can be replicated it will be replicated forever. And if it does we'll have infinite supply and will be worthless."]]
                 :parent-a 4
                 :parent-b 5}
                {:id 14
                 :title "Cryptocurrency Fallacy"
                 :description [:div 
                               [:p "Bitcoin can fail, but if it does cryptocurrencies cannot succeed."]
                               [:p "Maybe bitcoin can be reproduced, and we won’t have hard money then we’re back to fiat money."]
                               [:p "If it cannot be replicated all altcoins lose and we have hard money."]]
                 :parent-a 12
                 :parent-b 13}
                {:id 15
                 :title "Non Bitcoin Fallacy"
                 :description "Any project that claims to be similar to bitcoin but is not bitcoin can’t be something that can succeed"
                 :parent-a 11
                 :parent-b 14}
                {:id 16
                 :title "1st Principle (soft)"
                 :description "In a complex contest with a lot of noise, it’s safe to assume that what is not bitcoin is possibly a scam"
                 :parent-a 15
                 :parent-b 6}
                {:id 17
                 :title "1st Principle"
                 :description [:div
                               [:p "In a context with a lot of noise and full of noobs it doesn’t make sense to elaborate the whole explanation. So simplifying we can say:"]
                               [:p "\"Everything that is not Bitcoin is a scam\""]]
                 :parent-a 16
                 :parent-b 7}
                {:id 18
                 :title "Expected pressure"
                 :description "When some people see the tradeoff and can’t accept they will pose pressure to change bitcoin in a way that ignores trade-offs."
                 :parent-a 8
                 :parent-b 2}
                {:id 19
                 :title "No Rush"
                 :description [:div
                               [:p "If bitcoin doesn’t do something now it doesn’t matter, because if it was possible to create an alternative without destroying everything then we'd have infinite inflation."]
                               [:p "If altcoins are impossible there’s no reason to change bitcoin. In general, there's no reason to rush changes."]
                               [:p "If something else takes over okay, our experiment is over. But if there is no way for something else to take over then there’s no rush to change the status quo."]]
                 :parent-a 18
                 :parent-b 14}
                {:id 20
                 :title "Change Fallacy"
                 :description "Since there’s no rush to change bitcoin, every change we can do on an upper layer, we should do it on an upper layer and only very slowly propose. And in due time (if accepted by the users) migrate to the new version of the lower level."
                 :parent-a 19
                 :parent-b 4}
                {:id 21
                 :title "2nd Principle (soft)"
                 :description "When there’s a lot of noise it’s very safe to assume that any attempt to change bitcoin is fraudolent."
                 :parent-a 20
                 :parent-b 6}
                {:id 22
                 :title "2nd Principle"
                 :description "Every attempt to change bitcoin is a scam."
                 :parent-a 21
                 :parent-b 7}
                {:id 23
                 :title "Hyperbitcoinization Hypothesis"
                 :description [:div
                               [:p "We can imagine that the entire economy of the world changes, time preference of economical actors goes down, interest rates increase to natural levels."]
                               [:p "In this scenario as a society we stop borrowing money and start saving more money."]]
                 :parent-a 1
                 :parent-b 13}
                {:id 24
                 :title "Adoption Fallacy"
                 :description [:div 
                               [:p "It doesn’t really matter if people really adopt bitcoin, if bitcoin is niche and works for a small group of people we can get to mass adoption."] 
                               [:p "If bitcoin is mass adopted but doesn’t work (if it doesn't have the characterstics of hard money) as intended we have zero."]
                               [:p "The priority is keeping bitcoin doing what it does. Hard decentralized, trustless, store of value."]]
                 :parent-a 23
                 :parent-b 11}
                {:id 25
                 :title "3rd Principle (soft)"
                 :description [:div
                               [:p "It’s very likely that any kind of message that you get about using bitcoin as transactional money right now instead of focusing on hyperbitcoinisation is very likely to be a scam."]
                               [:p "When Overstock accepts bitcoin it isn’t great. You want to have people saving bitcoin, not accepting bitcoin and dumping it on the market. Not even storing it as money."]]
                 :parent-a 24
                 :parent-b 6}
                {:id 26
                 :title "3rd Principle"
                 :description "Gresham law. If there’s good money and bad money, bad money circulates a lot in the economy, while good money disappears from the economy and it’s used to store value. So every attempt to push people to spend bitcoin is a scam."
                 :parent-a 25
                 :parent-b 7}
                {:id 27
                 :title "4th Principle (soft)"
                 :description "If there’s a social layer on bitcoin, and we want to get rid of the statist regulation system, we have to put more effort in debunking lies and calling out scammers.
If you can make people pay some social cost for being scammers, make them pay."
                 :parent-a 9
                 :parent-b 10}
                {:id 28
                 :title "4th Principle"
                 :description "We shouldn’t be kind with scammers"
                 :parent-a 27
                 :parent-b 7}
                ]})
