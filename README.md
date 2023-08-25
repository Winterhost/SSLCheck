# SSLCheck

________________________________________________________________________________
SSLCheck is a simple java program that checks the SSL certificate of a given domain and returns information like the expiry date.

# Usage
________________________________________________________________________________
Either you can give the domain as a command line argument or you can enter it when the program asks for it.

<pre>java -jar SSLCheck.jar domain.de</pre>

# Examples:
________________________________________________________________________________
<pre>
Starting SSL check for https://winterhost.de...

Subject: CN=winterhost.de
Issuer: CN=R3, O=Let's Encrypt, C=US
Serial Number: 396924211943333153189513546871204241804744
Algorithm: SHA256withRSA
Expiration: Sat Oct 14 10:35:03 CEST 2023
</pre>