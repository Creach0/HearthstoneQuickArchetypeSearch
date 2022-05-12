# HearthstoneQuickArchetypeSearch
This is a service that enables a Hearthstone player to search for a name of a common Hearthstone deck archetype, and recieve as a response the most popular version of the deck list.

![image](https://user-images.githubusercontent.com/55264317/168024243-7db6e5b6-ba4f-4a6c-b39c-7d83f613157b.png)

It's a useful quick reference for players who don't want to have to pull up HSReplay and find their opponent's deck to see what they are running. Though I mainly built this with a plan to develop some kind of front-end interface for it, like a website or Discord bot.

It works by caching the current status of https://hsreplay.net/ 's Deck and Archetype lists, and comparing card IDs against https://hearthstonejson.com/ 's card API.

## Using this service:
A call can be made to <code>/findCommonDecklist?query={query}</code> to find the most common version of a given archetype. The name doesn't have to be exact, but it should be close (Note the image, for example).

The following information will be returned:

<code>archetypeName</code>: (String) The name of the Archetype found using your query.

<code>totalGames</code>: (Integer) The total number of games recorded by HSReplay with the exact returned decklist.

<code>winrate</code>: (Double) The average win/loss ratio, expressed as a percentage, of the exact returned decklist.

<code>coreCards</code>: (List) The most commonly occurring decklist of the given Archetype. This is expressed as a list of count-cardInfo pairs. The cards are sorted in order of mana cost.
