# ✅ **1. Two Sum**

**Difficulty:** Easy
**Topics:** Array, Hash Table
**Companies:** *Multiple*
**Hint:** Use a complement lookup strategy.

------

## 📝 **Problem Statement**

Given an integer array `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

You may assume:

- There is **exactly one solution**.
- You **may not** use the same element twice.
- You can return the answer in **any order**.

------

## 📘 **Examples**

### **Example 1**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
```

Explanation: `nums[0] + nums[1] == 9`.

------

### **Example 2**

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

------

### **Example 3**

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

------

## ✅ **Constraints**

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- **Exactly one valid answer exists**

------

## 🤔 **Follow-up**

Can you design an algorithm with **better than O(n²)** time complexity?

A HashMap-based complement lookup achieves **O(n)**.