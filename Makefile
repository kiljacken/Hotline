all:
	find ./src -name *.java | javac -classpath "${CLASSPATH}" @/dev/stdin
run:
	cd src/ && java dk.itu.bsdb.hotline.Hotline
