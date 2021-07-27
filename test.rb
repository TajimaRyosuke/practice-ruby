puts "計算を開始します。"
puts "何回計算を繰り返しますか？"

count = gets.to_i

i = 1

while i <= count do
  puts "#{i}回目の計算を始めます"
  puts "２つの数字を入力してください"
  a = gets.to_i
  b = gets.to_i

  puts "計算結果の出力をします"

  puts a+b
  puts a-b
  puts a*b
  puts a/b

  i += 1
end

puts "計算を終了します。"
puts "お疲れ様でした。"


