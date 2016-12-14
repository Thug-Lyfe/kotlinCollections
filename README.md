# Collections & ranges
Denne artikel omhandler brugen af collections og ranges

## Forfattere
Denne gruppe består af følgende deltagere:
- Marco S. Blum
- Christian Lind

## The features
Dette lille program er en viderebyggelse på vores tidligere arbejde med gyroskop og accelerometer.
Vi har tilføjet 2 counters, en "career high" og en "seasonal high".
"Career high" samler alle værdier den får fra accelerometerets 3 akser.
"Seasonal high" viser de højest nået værdier inden for de sidste 100 målinger der er lavet.

## Eksempler i praksis
```
for (index in sensorEvent.values.indices){
        if(sensorEvent.values[index]>max[index]){
              max[index]=sensorEvent.values[index]
        }
}
```

```
high.add(tot.last())
    if(high.count() !in 0..100) {
          high.removeAt(0);
    }
```
er det samme som: 
```
high.add(tot.last())
    if(high.count() >= 0 && high.count() <= 100) {
          high.removeAt(0);
    }
```
.count() giver antal af elements i en collection
.sum() giver summen af alle elements
.any() returns true, hvis der bare er et element
.any(fun) returns true, hvis der er bare et element i collectionen som giver true
.all(fun) returns true, hvis alle er true

## Pitfalls and hacks
Det ville være nemmere, hvis man skal bruge flere forskellige sensorer, at lave en separat fil som bruges som eventlistener. I vores app, bruger den kun mainActivity.kt, og kan derfor ikke bruges til mere end 1 sensor, da onSensorChanged vil blive kørt hver gang en af sensorerne bliver ændret.
Accelerometeret og gyroskopet, vil der hele tiden lave mikroskobiske ændrigner og functionen  onSensorChanged vil derfor blive kørt konstant.
