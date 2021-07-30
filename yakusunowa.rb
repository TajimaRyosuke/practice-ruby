puts 1234567890
puts 5000000

puts 1234567890

def divisor_sum(num, limit)
  (1..limit).select{ |i| num % i == 0 }.sum
end

puts divisor_sum(1234567890, 5000000)