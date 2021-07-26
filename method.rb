def greeting(name)
  puts "お名前を教えてください。"
  name = gets
  "Hello, #{name}"
end

puts greeting('name')
