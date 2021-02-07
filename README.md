# fb

A library for "Personal Analytics"

-or-

A way to browse my facebook posts without having to use their awful app.

## Rationale

Since 2007 I've basically used Facebook as a journal, or "Captain's Log".
Thus it has become the most consistent source of data about my life.
However, the interests of social media go against this philosophy because they need to encourage content to be "throwaway" so they can maintain a steady spray of shit in our faces. Therefore they make no effort to optimize navigating archives and might even go out of their way to make it difficult, negating what I see as the medium's best strength - an archive of our digital lives.

## Usage

FIXME: write usage documentation!

Invoke a library API function from the command-line:

    $ clojure -X porkostomus.fb/foo :a 1 :b '"two"'
    {:a 1, :b "two"} "Hello, World!"

Run the project's tests (they'll fail until you edit them):

    $ clojure -M:test:runner

Build a deployable jar of this library:

    $ clojure -X:jar

Install it locally:

    $ clojure -M:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -M:deploy

## License

Copyright © 2021 Porky

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
