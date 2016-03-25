(ns systemProperties.core
	(:gen-class ))

(defn -main [& args]  ;; allows variable number of parameters

(def prop1 "file.separator") 	;;Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
(def prop2 "java.class.path") 	;;Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
(def prop3 "java.home") 	;;Installation directory for Java Runtime Environment (JRE)
(def prop4 "java.vendor") 	;;JRE vendor name
(def prop5 "java.vendor.url") 	;;JRE vendor URL
(def prop6 "java.version") 	;;JRE version number
(def prop7 "line.separator") 	;;Sequence used by operating system to separate lines in text files
(def prop8 "os.arch") 	;;Operating system architecture
(def prop9 "os.name") 	;;Operating system name
(def propa "os.version") 	;;Operating system version
(def propb "path.separator") 	;;Path separator character used in java.class.path
(def propc "user.dir") 	;;User working directory
(def propd "user.home") 	;;User home directory
(def prope "user.name") 	;;User account name
(def prop1 "file.separator") 	;;Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
(def prop2 "java.class.path") 	;;Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
(def prop3 "java.home") 	;;Installation directory for Java Runtime Environment (JRE)
(def prop4 "java.vendor") 	;;JRE vendor name
(def prop5 "java.vendor.url") 	;;JRE vendor URL
(def prop6 "java.version") 	;;JRE version number
(def prop7 "line.separator") 	;;Sequence used by operating system to separate lines in text files
(def prop8 "os.arch") 	;;Operating system architecture
(def prop9 "os.name") 	;;Operating system name
(def propa "os.version") 	;;Operating system version
(def propb "path.separator") 	;;Path separator character used in java.class.path
(def propc "user.dir") 	;;User working directory
(def propd "user.home") 	;;User home directory
(def prope "user.name") 	;;User account name
(def propf "java.vm.version") 	;;

 (def tobechecked (seq [prop1 prop2 prop3]))

(System/getProperty prop1)
(System/getProperty prop2)
(System/getProperty prop3)
(System/getProperty prop4)
(System/getProperty prop5)
(System/getProperty prop6)
(System/getProperty prop7)
(System/getProperty prop8)
(System/getProperty prop9)
(System/getProperty propa)
(System/getProperty propc)
(System/getProperty propd)
(System/getProperty prope)
(System/getProperty propf)


(def propf "java.vm.version") 	;;



(System/getProperty prop1)
(System/getProperty prop2)
(System/getProperty prop3)
(System/getProperty prop4)
(System/getProperty prop5)
(System/getProperty prop6)
(System/getProperty prop7)
(System/getProperty prop8)
(System/getProperty prop9)
(System/getProperty propa)
(System/getProperty propb)
(System/getProperty propc)
(System/getProperty propd)
(System/getProperty prope)
(System/getProperty propf)

(str "user name: " (System/getProperty prope))

(defn showProp [prop]
	( println  (str prop ":" (System/getProperty prop))))
;; (showProp prop1)
	;; mod 17.04.2015 02:06:39
(showProp prop1)
(showProp prop2)
(showProp prop3)
(showProp prop4)
(showProp prop5)
(showProp prop6)
(showProp prop7)
(showProp prop8)
(showProp prop9)
(showProp propa)
(showProp propb)
(showProp propc)
(showProp propd)
(showProp prope)
(println (showProp propf))
(println tobechecked)  ;; example of printing a sequence 
)

