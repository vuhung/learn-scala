#Git/Github installation, configuration and integration with Ubuntu 14.04

> For Ubuntu 14.04 and github.com as of 2015/03/25

## Setup ssh-key

### On Ubuntu
```
cd ~/.ssh 
ssh-keygen -t rsa -C "my.email.address.used.with.github@gmail.com" 
gedit id_rsa.pub and copy the content of the file "id_rsa.pub" to clipboard
```

### On github.com
```
Open https://github.com/settings/ssh
Click: "Add another public key"
Paste the copied content into the "key field" and press "Add key" 
```

## Add ssh-key
```
ssh-add 
```

## Install Github
```
sudo apt-get install git-core git-gui git-doc 
```

## Start cloning source code
```
git clone git@github.com:vuhung/dddsample.git
```

## Start modifying and commit files:
```
git add README.md 
git commit
git push origin master
```
