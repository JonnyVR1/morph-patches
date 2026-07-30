package com.immomo.mmhttp.cookie.store;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p149l.at6;

/* JADX INFO: loaded from: classes7.dex */
public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;
    private transient at6 clientCookie;
    private final transient at6 cookie;

    public SerializableHttpCookie(at6 at6Var) {
        this.cookie = at6Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z = objectInputStream.readBoolean();
        boolean z2 = objectInputStream.readBoolean();
        boolean z3 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        at6.C15711a c15711aM98784d = new at6.C15711a().m98787g(str).m98790j(str2).m98784d(j);
        at6.C15711a c15711aM98788h = (z3 ? c15711aM98784d.m98785e(str3) : c15711aM98784d.m98782b(str3)).m98788h(str4);
        if (z) {
            c15711aM98788h = c15711aM98788h.m98789i();
        }
        if (z2) {
            c15711aM98788h = c15711aM98788h.m98786f();
        }
        this.clientCookie = c15711aM98788h.m98781a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.cookie.m98775g());
        objectOutputStream.writeObject(this.cookie.m98780r());
        objectOutputStream.writeLong(this.cookie.m98772d());
        objectOutputStream.writeObject(this.cookie.m98771b());
        objectOutputStream.writeObject(this.cookie.m98776n());
        objectOutputStream.writeBoolean(this.cookie.m98778p());
        objectOutputStream.writeBoolean(this.cookie.m98774f());
        objectOutputStream.writeBoolean(this.cookie.m98773e());
        objectOutputStream.writeBoolean(this.cookie.m98777o());
    }

    public at6 getCookie() {
        at6 at6Var = this.cookie;
        at6 at6Var2 = this.clientCookie;
        return at6Var2 != null ? at6Var2 : at6Var;
    }
}
