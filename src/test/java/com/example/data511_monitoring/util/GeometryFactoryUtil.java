public class GeometryFactoryUtil {

    private static final GeometryFactory GEOMETRY_FACTORY =
        new GeometryFactory(new PrecisionModel(), 4326);

    public static LineString createLine() {
        return GEOMETRY_FACTORY.createLineString(new Coordinate[]{
            new Coordinate(-122.42, 37.77),
            new Coordinate(-122.43, 37.78)
        });
    }

}
