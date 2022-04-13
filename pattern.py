#up

rows = 5

for i in range(rows):
    for j in range(1+i):
        print(1+j, end=" ")
    print("\n")
    
    
#down 
    
rows = 5

for i in range(rows, 0, -1):
    for j in range(1, i+1):
        print(j, end=" ")
    
    print("\n")
    
 #"*" pattern
rows = 5

for i in range(rows):
    for j in range(1+i):
        print("*", end=" ")
    print("\n")
