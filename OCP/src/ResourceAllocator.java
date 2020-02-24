public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Slot slot)
    {
        int resourceId;
        slot.findFreeSlot();
        slot.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Slot slot, int resourceId)
    {
        slot.markSlotFree(resourceId);
    }

}
