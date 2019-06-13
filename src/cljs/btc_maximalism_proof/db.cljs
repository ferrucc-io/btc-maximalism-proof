(ns btc-maximalism-proof.db)

(def default-db
  {:primitives [{:id 1
                 :title "Hard vs Easy"
                 :description "Money that is hard to create and censor is hard to come by. There’s already a lot of money that is easy to censor and easy to create, no need for other alternatives. The alternative cannot be diluted or censored. Differences must be kept."
                 :parent-a 0
                 :parent-b 0}
                {:id 2
                 :title "Coinbase & Blockchain"
                 :description "There’s nothing new in bitcoin, most of them are legacy. Only two new things are coinbase process, fixed monetary policy and blockchain. Blockchain is not a silver bullet, it makes systems worse, slower and less privacy friendly."
                 :parent-a 0
                 :parent-b 0}

                {:id 3
                 :title "Cloning Theorem"
                 :description "In FLOSS if a project  is successful and there’s money to be made with a project somebody will clone it. because bitcoin software is free everyone will try to copy it. every person that can create money will try to create money. everybody will try to create their scam coin."
                 :parent-a 0
                 :parent-b 0}
                {:id 4
                 :title "Top VS Bottom"
                 :description "Complex systems are layered. Infrastructures languages and protocols are a base layer, products that compete are meant to stay in upper layers. Competition belongs to top layers. The market doesn’t want many social medias changing too much. But you can have competition at this layer, slower. The world wide web instead is something we want to change at an even slower pace. Every time the web changes you destroy the upper levels to change. The free market converges to the use of one protocol, a common language. Below the web tcp/ip v4, was finalised in 1983, the market refused changes since then. Even during the cold war we were using the same tcp/ip, even china with the great firewall is using it. This doesn’t mean the protocol is perfect, in fact it sucks. When trying to build skype, developers realised TCP/IP wasn’t scalable enough, so they changed it, but the market refused it. And today any call we do we still use this ugly old protocol and it’s immutable. TCP/IP 6 exists, but in 20 years we haven’t been able to migrate to it. 20% of the internet is migrating.
At a communication level, even as humans right now we’re converging to English, even if it’s not my native language, and most likely (from my Google Analytics data) not even yours. This is not because english is the best language, but because of network effects."
                 :parent-a 0
                 :parent-b 0}
                {:id 5
                 :title "Immaculate Conception"
                 :description "Bitcoin showed a degree of resistance to censorship that cannot be replicated because of the extraordinary uniqueness of the historical condition. Because of Satoshi’s opsec, Satoshi’s incentives and historical salience (2008) 
In 2009 you can stay in the underground doing this kind of work because anarchist money was an experiment that 20 people are trying since a decade failing. Any operation that now tries to do this now, is under heavier scrutiny and has a larger risk of being compromised. Social attack vectors would be viable now, as more people care about this.
It may not be enough as Satoshi could be in a jail right now, but now it would be orders of magnitude harder than the original attempt.
Satoshi’s incentives also weren’t about buying a lamborghini in the next months. After the bitcoin bubbles and ico bubbles. Satoshi didn’t ask the question “How can I get payed for the work I’m doing?”. He didn’t create a newsletter and send out an email saying “here’s an idea, a whitepaper, i can make it come true, but first wire me 20 million bucks”. he created the whitepaper, nobody cared, launched the software and then it started to work. This doesn’t mean asking for money is evil. It’s just that the incentive structure satoshi had wasn’t strictly connected to monetization. He could afford to launch something because in his opinion the world needed something like that. Even if you try to do that people around you will know. And will attract people with bad incentives.
The schelling point is bitcoin, if you think about cryptocurrency, the majority of people will think we’re talking about bitcoin. "
                 :parent-a 0
                 :parent-b 0}
                {:id 6
                 :title "Scam Definition"
                 :description "A Scam is someone that acquires money wealth and power fame or lambos by lying and that person understood they were lying or have enough information to realise so, then they’re scammers."
                 :parent-a 0
                 :parent-b 0}
                {:id 7
                 :title "Simplification Proviso"
                 :description "When you have to counteract social attacks it’s okay to reduce the nuances and oversimplify things to create a set of heuristics easy to communicate and use.\neg. “You should not roll your own cryptography”"
                 :parent-a 0
                 :parent-b 0}
                {:id 8
                 :title "Populist Theory"
                 :description "Everyone will try to create a populistic conspiracy theory. Life is full of trade offs. Humans have a tendency of spreading the belief that tradeoffs are all created by evil people. Especially in economics there’s this idea that there is no scarcity. “You’re not poor because you’re not serving the market, you’re poor because there’s an evil group of people keeping you poor”
For instance if you get bigger blocks, you also raise the synchronization costs. People will lie to you saying you can have things without any kind of sacrifice. You should expect this to happen in every complex field."
                 :parent-a 0
                 :parent-b 0}
                {:id 9
                 :title "Social Layer"
                 :description "Systems like bitcoin aren’t just software are social protocols. TCP/IP is the protocol of the internet because people people will choose browsers compatible with tcp/ip. Bitcoin has a social layer that can be attacked and damaged. It’s cheap and free to attack the social layer of bitcoin without spending any money. Social attacks are the easiest attack vector."
                 :parent-a 0
                 :parent-b 0}
                {:id 10
                 :title "Inner Regulator"
                 :description " If we like freedom we should stop defending bitcoin from scams. Since we want to get rid of external censorship coercion and regulation it’s important to have strict self regulation. Being vocal about what’s a scam, a fraud an attack a bad actor doesn’t equate to wanting intervention from violent regulation. It’s the opposite in fact, we’re getting rid of governments and laws so we need a lot of self discipline on a cultural level."
                 :parent-a 0
                 :parent-b 0}
                {:id 11
                 :title "Blockchain Fallacy"
                 :description ""
                 :parent-a 1
                 :parent-b 2}
                {:id 12
                 :title "Supply Inflation"
                 :description ""
                 :parent-a 1
                 :parent-b 3}
                {:id 13
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 14
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 15
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 16
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 17
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 18
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 19
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 20
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 21
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 22
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 23
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 24
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 25
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 26
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                {:id 27
                 :title ""
                 :description ""
                 :parent-a 0
                 :parent-b 0}
                ]})
