LATEXMK = latexmk

.PHONY: pdf
pdf:
	${LATEXMK} -recorder -pdf -output-directory=build main.tex

.PHONY: clean
clean:
	rm -rf ./build