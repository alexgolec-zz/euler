(println (first (
    for [a (range 1 1000)
          b (range 1 a)
        :let [c (- 1000 a b)]
        :when (= (+ (* a a) (* b b))
                  (* c c))]
        (* a b c)
)))
