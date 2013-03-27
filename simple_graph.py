#!/usr/bin/env python

# Graph representations

a, b, c, d, e, f, g, h = range(8)

# A straightforward adjacency set representation
N1 = [
    {b, c, d, e, f},    # a
    {c, e},             # b
    {d},                # c
    {e},                # d
    {f},                # e
    {c, g, h},          # f
    {f, h},             # g
    {f, g}              # h
]
print(b in N1[a])  # Neighborhood membership
print(len(N1[f]))  # Degree

# Adjacency Lists
N2 = [
    [b, c, d, e, f],    # a
    [c, e],             # b
    [d],                # c
    [e],                # d
    [f],                # e
    [c, g, h],          # f
    [f, h],             # g
    [f, g]              # h
]
print(b in N2[a])  # Neighborhood membership
print(len(N2[f]))  # Degree

# Adjacency dicts with Edge Weights
N3 = [
    {b:2, c:1, d:3, e:9, f:4},
    {c:4, e:3},
    {d:8},
    {e:7},
    {f:5},
    {c:2, g:2, h:2},
    {f:1, h:6},
    {f:9, g:8}
]
print(b in N3[a]) # Neighborhood membership
print(len(N3[f])) # Degree
print(N3[a][b])   # Edge weight for (a, b)

# A Dict with Adjacency Sets
N4 = {
    'a': set('bcdef'),
    'b': set('ce'),
    'c': set('d'),
    'd': set('e'),
    'e': set('f'),
    'f': set('cgh'),
    'g': set('fh'),
    'h': set('fg')
}

# An Adjacency Matrix, Implemented with Nested Lists
N5 = [[0,1,1,1,1,1,0,0], # a
      [0,0,1,0,1,0,0,0], # b
      [0,0,0,1,0,0,0,0], # c
      [0,0,0,0,1,0,0,0], # d
      [0,0,0,0,0,1,0,0], # e
      [0,0,1,0,0,0,1,1], # f
      [0,0,0,0,0,1,0,1], # g
      [0,0,0,0,0,1,1,0]] # h
print(N5[a][b])   #Neighborhood membership
print(sum(N5[f]))  # Degree

# A Weight Matrix with Infinite Weight for Missing Edges
_ = float('Inf')
W = [[0,2,1,3,9,4,_,_], # a
     [_,0,4,_,3,_,_,_], # b
     [_,_,0,8,_,_,_,_], # c
     [_,_,_,0,7,_,_,_], # d
     [_,_,_,_,0,5,_,_], # e
     [_,_,2,_,_,0,2,2], # f
     [_,_,_,_,_,1,0,6], # g
     [_,_,_,_,_,9,8,0]] # h
print(W[a][b] < _)  # Neighborhood membership
print(W[c][e] < _)  # Neighborhood membership
print(sum(1 for w in W[a] if w < _) - 1)  # Degree
