-- 코드를 입력하세요
-- 1.상반기 아이스크림 총주문량이 3,000보다 높으면서 
-- 2. 아이스크림의 주 성분이 과일인 
-- 3.아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.
SELECT 
    A.FLAVOR
from
    first_half A , icecream_info B
where
     A.FLAVOR = B.FLAVOR
and
    A.TOTAL_ORDER > 3000
and
     B.INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc