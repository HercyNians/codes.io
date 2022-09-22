money = eval(input("Please set money = "))
tuple0 = (100,50,20,10,5,2,1)

i =0
while i <=6 :
    tuple1 = divmod(money,tuple0[i])
    money = tuple1[1]
    if tuple1[0] !=0 :
        print("需要",tuple0[i],"元纸币的数量为",tuple1[0],"张")
    i = i + 1