public interface QueueBehaviour {
    void enqueue(Person person);
    Person dequeue();
    int getQueueSize();
}
