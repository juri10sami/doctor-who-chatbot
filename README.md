# doctor who chatbot

This repository contains a simple Doctor Who-themed chatbot implemented in Java. The chatbot simulates conversations by answering questions about Doctor Who lore, including characters, enemies, and famous quotes. It uses custom logic and randomization to provide dynamic responses, creating an engaging user experience.

## Features
- **Interactive Chatbot**: The chatbot can respond to user inputs with themed answers about Doctor Who.
- **Natural Language Processing (NLP)**:
  - Tokenization of input strings to process user queries.
  - Categorization of responses based on keywords like "what," "how," "can," and "who."
- **Dynamic Responses**:
  - Randomized responses to create a conversational experience.
  - Context-specific replies based on user input.
- **Doctor Who Knowledge Base**:
  - Information about the Doctor, companions, enemies, TARDIS, and other lore.
  - Famous quotes and trivia integrated into responses.

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/juri10sami/doctor-who-chatbot.git
   
## Navigate to the project directory:
```bash
Copy code
cd doctor-who-chatbot
Open the Doctor.java file in your preferred Java IDE (e.g., IntelliJ, Eclipse, or VS Code).
Compile the program:
```bash
Copy code
javac Doctor.java
Run the program:
```bash
Copy code
java Doctor
Start chatting with the Doctor Who chatbot by typing questions into the console!

## Example Questions:
"Who are the Doctor's companions?"
"What is the TARDIS?"
"Can the Doctor die?"
"How does regeneration work?"
"What are the Doctor's greatest fears?"

##Technologies Used:
Java 8+: Programming language for the chatbot logic.
ArrayList: Data structure for managing keywords and responses.
Scanner: For reading user input.
Project Structure
tokenization Method:
Breaks user input into individual words for keyword detection.
answers Method:
Routes input to appropriate response-generating methods (what, how, can, who).
Custom Response Methods:
what, how, can, who, and others provide dynamic, context-based replies.
Random Response Generator:
Adds variation to the chatbot's replies for a more engaging experience.

## Future Improvements
Implement advanced NLP for better understanding of user input.
Add a GUI for a more interactive user interface.
Expand the Doctor Who knowledge base with more trivia and responses.
Introduce sentiment analysis to tailor responses based on user tone.
Acknowledgments
This project was inspired by the BBC's iconic series Doctor Who. It serves as a learning exercise in Java programming and chatbot development.

