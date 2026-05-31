
# Hospital Emergency Response and Medical Resource Network Optimization

## Project Overview

This project demonstrates the application of advanced data structures and graph algorithms in a healthcare environment. The system is designed to optimize hospital connectivity, emergency response planning, medical resource allocation, and patient data analysis.

The project implements:

- Segment Tree
- Fenwick Tree (Binary Indexed Tree)
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Prim's Algorithm
- Kruskal's Algorithm

These algorithms are widely used in healthcare systems, emergency response networks, infrastructure planning, communication systems, and database indexing.

---

## Objectives

- Apply Segment Trees for efficient interval and range query processing.
- Apply Fenwick Trees for fast updates and prefix-sum calculations.
- Use BFS to analyze hospital network connectivity.
- Use DFS to explore and verify complete network connections.
- Construct Minimum Spanning Trees using Prim's Algorithm.
- Construct Minimum Spanning Trees using Kruskal's Algorithm.
- Compare graph traversal and MST algorithms in healthcare infrastructure planning.


## Problem Statement

A healthcare authority manages multiple hospitals and emergency response centers connected through transportation and communication networks.

The authority needs a system that can:

- Analyze patient admissions over specific periods.
- Track hospital occupancy levels efficiently.
- Determine connectivity among hospitals.
- Explore all available emergency routes.
- Design cost-effective communication and transportation networks.

To solve these challenges, Segment Trees, Fenwick Trees, BFS, DFS, Prim's Algorithm, and Kruskal's Algorithm are implemented.

---

## Algorithms Implemented

### 1. Segment Tree

#### Purpose
Stores patient admission records and performs efficient range queries.

#### Applications
- Patient admission analysis
- Medical record aggregation
- Database interval queries

#### Complexity

```text
Build: O(n)
Query: O(log n)
```

---

### 2. Fenwick Tree (Binary Indexed Tree)

#### Purpose
Provides fast updates and prefix-sum calculations.

#### Applications
- Bed occupancy monitoring
- Resource allocation tracking
- Healthcare analytics

#### Complexity

```text
Update: O(log n)
Query: O(log n)
```

---

### 3. Breadth-First Search (BFS)

#### Purpose
Traverses hospitals level-by-level from a source hospital.

#### Applications
- Emergency response planning
- Reachability analysis
- Communication network traversal

#### Complexity

```text
O(V + E)
```

---

### 4. Depth-First Search (DFS)

#### Purpose
Explores all connected hospitals recursively.

#### Applications
- Connectivity verification
- Network exploration
- Route discovery

#### Complexity

```text
O(V + E)
```

---

### 5. Prim's Algorithm

#### Purpose
Constructs a Minimum Spanning Tree (MST) using the lowest-cost edges.

#### Applications
- Communication network design
- Infrastructure optimization
- Emergency service connectivity

#### Complexity

```text
O(V²)
```

---

### 6. Kruskal's Algorithm

#### Purpose
Constructs a Minimum Spanning Tree by selecting the smallest-weight edges.

#### Applications
- Ambulance route planning
- Transportation network optimization
- Hospital clustering

#### Complexity

```text
O(E log E)
```

---

## Sample Input

### Patient Admissions

```text
20 30 40 50 60
```

### Hospital Occupancy Updates

```text
Ward 1 = 20
Ward 2 = 30
```

### Weighted Hospital Network

```text
0 --2-- 1
|       |
6       3
|       |
3 --4-- 2
```

---

## Expected Output

```text
Admissions (1-3): 120
Occupied Beds: 50

Prim MST:
0 - 1 : 2
1 - 2 : 3
2 - 3 : 4

Kruskal MST:
0 - 1 : 2
1 - 2 : 3
2 - 3 : 4

Hospital Network Optimized
```

---

## Performance Analysis

| Algorithm / Structure | Time Complexity |
|----------------------|----------------|
| Segment Tree Build | O(n) |
| Segment Tree Query | O(log n) |
| Fenwick Tree Update | O(log n) |
| Fenwick Tree Query | O(log n) |
| BFS | O(V + E) |
| DFS | O(V + E) |
| Prim's Algorithm | O(V²) |
| Kruskal's Algorithm | O(E log E) |

Where:

- V = Number of vertices (hospitals)
- E = Number of edges (connections)
- n = Number of records

---

## Applications

### Healthcare Systems
- Hospital Connectivity Analysis
- Emergency Response Planning
- Medical Resource Allocation

### Infrastructure Design
- Communication Network Planning
- Transportation Route Optimization

### Database Systems
- Range Queries
- Data Aggregation
- Storage Optimization

### Smart Cities
- Emergency Services
- Healthcare Infrastructure Management

---

## Results

The implemented system successfully:

- Processed patient admission interval queries.
- Calculated hospital occupancy efficiently.
- Explored hospital connectivity using BFS and DFS.
- Constructed optimal communication networks using Prim's Algorithm.
- Designed cost-effective transportation routes using Kruskal's Algorithm.

The algorithms demonstrated efficient performance and practical applicability in healthcare infrastructure management.

---

## Conclusion

This project successfully demonstrates the use of Segment Trees, Fenwick Trees, BFS, DFS, Prim's Algorithm, and Kruskal's Algorithm for solving real-world healthcare and emergency response problems. The implemented techniques improve data processing efficiency, network connectivity analysis, and infrastructure cost optimization. These algorithms are highly applicable in hospitals, logistics systems, smart cities, and large-scale network design.

