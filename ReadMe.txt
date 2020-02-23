##########SpringBootTech############

Developer=Bikash Kaushik

1. http://10.170.100.15:9080/api/getFlightData
Method Type : POST
Input :
{
	"FromDate":"2020-01-30 10:00",
	"ToDate":"2020-01-30 12:00"
}

2. http://10.170.100.15:9080/api/getCrewonBoard
Method Type : POST
Input :
{
	"FltNbr":"205",
	"starttimefrom": "2017-09-01",
    	"starttimeto": "2017-09-10"
}

3. http://10.170.100.15:9080/api/getHello
Method Type : GET

4. http://10.170.100.15:9080/api/FibonacciSeries
Method Type : GET

Docker Build :
docker build -t springboottech .
docker run -it -d --name SpringBootTechAnalysis -p 9080:9080 springboottech
