# -*- coding: utf-8 -*-
"""
Created on Sat Sep 10 11:23:00 2022

@author: hercynians
"""


PI = 3.14159

def volume(r,h):
    s = PI * (r ** 2)
    v = s * h
    print("v = "+ str(v)+" ("+str(r**2*h)+"pi)")

volume(r = eval(input("Please set r = ")),h = eval(input("Please set h = ")))
