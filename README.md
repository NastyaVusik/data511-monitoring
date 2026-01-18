
Run general compose.yaml + dev environment:
docker compose -f compose.yaml -f compose.dev.yaml up --build

Run general compose.yaml + dev environment in background:
docker compose -f compose.yaml -f compose.dev.yaml up -d --build

Stop all containers in docker compose:
docker compose down
