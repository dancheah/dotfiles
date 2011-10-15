#!/bin/sh -xv
# Build perl so that we can run Padre
perlbrew install perl-5.14.2 -Dusethreads -Duselargefiles \
-Dcccdlflags=-fPIC -Doptimize=-O2 \
-Duseshrplib -Dcf_by="D Cheah" \
-Dcf_email="sigsegv@gmail.com"
