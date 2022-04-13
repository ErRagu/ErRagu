n=int(input("enter the limit : "))
a=[]
print("enter the value : ")
for i in range(n):
    a.append(int(input()))
print("\nadd num")
for i in range(n):
    if a[i]%2!=0:
     print("a[",i,"]=",a[i])
print("\neven num")
for i in range(n):
    if a[i]%2==0:
        print("a[",i,"]=",a[i])
