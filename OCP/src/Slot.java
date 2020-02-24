public interface Slot {
    public void markSlotBusy(int resourceId);
    public void markSlotFree(int resourceId);
    public int findFreeSlot();
}
