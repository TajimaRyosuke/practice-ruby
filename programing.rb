# puts 1234567890
# puts 5000000

# puts 1234567890

# def divisor_sum(num, limit)
#   (1..limit).select{ |i| num % i == 0 }.sum
# end

# puts divisor_sum(1234567890, 5000000)

  sum = 0
10000.times do |timesCount|
  count = timesCount + 1
  sum += 1.0/count
  if sum >= 8
  puts sum
  puts count
  return
  end
end