# continuous_integration
Laget først et git reposetory hvor jeg lastet opp alle filene til.
Gikk inn på actions og fant en ferdig workflow som heter "Java with Maven". 
Valgte å kalle denne filen for tests.yml og det endret kun java version 
fra 11 til 16 og pushed denne til repoet.

Etter mye testing fant jeg ut at det var en del warnings med pom.xml filen 
som gjorde at testene ikke ble kjørt så endret på den. Endret også test filen 
fra leap_year_test til Test_leap_year.
