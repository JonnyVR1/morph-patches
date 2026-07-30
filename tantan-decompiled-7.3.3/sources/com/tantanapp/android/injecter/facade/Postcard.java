package com.tantanapp.android.injecter.facade;

import android.net.Uri;
import android.os.Bundle;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p153l.mum;

/* JADX INFO: loaded from: classes11.dex */
public final class Postcard extends RouteMeta {
    private int flags;
    private Bundle mBundle;
    private IProvider provider;
    private Object tag;
    private int timeout;
    private Uri uri;

    public Postcard(String str, String str2, Uri uri, Bundle bundle) {
        this.flags = -1;
        this.timeout = 300;
        setPath(str);
        setGroup(str2);
        setUri(uri);
        this.mBundle = bundle == null ? new Bundle() : bundle;
    }

    public Bundle getExtras() {
        return this.mBundle;
    }

    public IProvider getProvider() {
        return this.provider;
    }

    public Object getTag() {
        return this.tag;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public Uri getUri() {
        return this.uri;
    }

    public Object navigation() {
        return mum.m160228d().m160232f(this);
    }

    public Postcard setProvider(IProvider iProvider) {
        this.provider = iProvider;
        return this;
    }

    public Postcard setTag(Object obj) {
        this.tag = obj;
        return this;
    }

    public Postcard setTimeout(int i) {
        this.timeout = i;
        return this;
    }

    public Postcard setUri(Uri uri) {
        this.uri = uri;
        return this;
    }

    @Override // com.tantanapp.android.injecter.facade.model.RouteMeta
    public String toString() {
        return "Postcard{uri=" + this.uri + ", tag=" + this.tag + ", mBundle=" + this.mBundle + ", flags=" + this.flags + ", timeout=" + this.timeout + ", provider=" + this.provider + "}\n" + super.toString();
    }

    public Postcard withBoolean(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
        return this;
    }

    public Postcard withByte(String str, byte b) {
        this.mBundle.putByte(str, b);
        return this;
    }

    public Postcard withDouble(String str, double d) {
        this.mBundle.putDouble(str, d);
        return this;
    }

    public Postcard withFloat(String str, float f) {
        this.mBundle.putFloat(str, f);
        return this;
    }

    public Postcard withInt(String str, int i) {
        this.mBundle.putInt(str, i);
        return this;
    }

    public Postcard withLong(String str, long j) {
        this.mBundle.putLong(str, j);
        return this;
    }

    public Postcard withShort(String str, short s) {
        this.mBundle.putShort(str, s);
        return this;
    }

    public Postcard withString(String str, String str2) {
        this.mBundle.putString(str, str2);
        return this;
    }

    public Postcard(String str, String str2) {
        this(str, str2, null, null);
    }
}
