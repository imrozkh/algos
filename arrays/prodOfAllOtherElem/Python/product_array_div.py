def product_of_array(nums):
    # get the multiplications
    product=1
    for num in nums:
        product = product * num
    
    for i in range(len(nums)):
        nums[i] = product / nums[i]

    return nums

nums = [1,2,3,4,5]
print(nums)
print(product_of_array(nums))
