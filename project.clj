(defproject funcool/codeina "0.1.0"
  :description "Generate documentation from Clojure source files"
  :url "https://github.com/funcool/codeina"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                 [org.clojure/clojurescript "0.0-3269"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [leinjacker "0.4.2"]
                 [hiccup "1.0.5"]
                 [org.pegdown/pegdown "1.4.2"]]
  :jar-exclusions [#"\.swp|\.swo|user.clj"]
  :eval-in-leiningen true)
