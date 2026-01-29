public class TestRoadSegmentFactory {

    private static final GeometryFactory GEOMETRY_FACTORY =
            new GeometryFactory(new PrecisionModel(), 4326);

    public static RoadSegment createRoadSegment() {
        RoadSegment rs = new RoadSegment();
        rs.setId(UUID.randomUUID());
        rs.setExternalId("ext-" + UUID.randomUUID());
        rs.setGeometry(createLine());
        return rs;
    }
}
