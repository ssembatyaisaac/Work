help = input(">")
if help == "help":
    print("start - to start the car")
    print("stop - to stop the car")
    print("quit - to exit")

    while 1:
        action = input(">")
        if action == "start":
            print("Car started...Ready to go!") 
        elif action == "stop":
            print("Car stopped")
        elif action == "quit":
            break
        else:
            print("I don't understand that")
else:
    print("I don't understand that")