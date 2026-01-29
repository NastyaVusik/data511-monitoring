
***Run general compose.yaml + dev environment:**
docker compose -f compose.yaml -f compose.dev.yaml up --build

Run general compose.yaml + dev environment in background:
docker compose -f compose.yaml -f compose.dev.yaml up -d --build

Stop all containers in docker compose:
docker compose down

Call HealthCheckController:
1) In browser
http://localhost:8080/health

2) In terminal
curl http://localhost:8080/health


***Test environment:**
class TestRoadSegmentFactory - responsible for creating valid RoadSegment objects
class GeometryFactoryUtil - Create geometry test primitives (spatial geometry - LineString, SRID, coordinates, GeometryFactory)