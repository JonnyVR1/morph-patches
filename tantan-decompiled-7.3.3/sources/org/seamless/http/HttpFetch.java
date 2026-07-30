package org.seamless.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.eclipse.jetty.http.HttpMethods;
import org.seamless.util.p129io.C22266IO;

/* JADX INFO: loaded from: classes3.dex */
public class HttpFetch {

    public interface RepresentationFactory<E> {
        Representation<E> createRepresentation(URLConnection uRLConnection, InputStream inputStream) throws IOException;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public static <E> Representation<E> fetch(URL url, String str, int i, int i2, RepresentationFactory<E> representationFactory) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2 = null;
        inputStream2 = null;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection2.setRequestMethod(str);
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i2);
                    inputStream2 = httpURLConnection2.getInputStream();
                    Representation<E> representationCreateRepresentation = representationFactory.createRepresentation(httpURLConnection2, inputStream2);
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    return representationCreateRepresentation;
                } catch (IOException e) {
                    e = e;
                    InputStream inputStream3 = inputStream2;
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream3;
                    try {
                        if (httpURLConnection == null) {
                            throw e;
                        }
                        throw new IOException("Fetching resource failed, returned status code: " + httpURLConnection.getResponseCode());
                    } catch (Throwable th) {
                        inputStream2 = inputStream;
                        th = th;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        }
    }

    public static Representation<byte[]> fetchBinary(URL url, int i, int i2) throws IOException {
        return fetch(url, i, i2, new RepresentationFactory<byte[]>() { // from class: org.seamless.http.HttpFetch.1
            @Override // org.seamless.http.HttpFetch.RepresentationFactory
            public Representation<byte[]> createRepresentation(URLConnection uRLConnection, InputStream inputStream) throws IOException {
                return new Representation<>(uRLConnection, C22266IO.readBytes(inputStream));
            }
        });
    }

    public static Representation<String> fetchString(URL url, int i, int i2) throws IOException {
        return fetch(url, i, i2, new RepresentationFactory<String>() { // from class: org.seamless.http.HttpFetch.2
            @Override // org.seamless.http.HttpFetch.RepresentationFactory
            public Representation<String> createRepresentation(URLConnection uRLConnection, InputStream inputStream) throws IOException {
                return new Representation<>(uRLConnection, C22266IO.readLines(inputStream));
            }
        });
    }

    public static void validate(URL url) throws Throwable {
        fetch(url, HttpMethods.HEAD, 500, 500, new RepresentationFactory() { // from class: org.seamless.http.HttpFetch.3
            @Override // org.seamless.http.HttpFetch.RepresentationFactory
            public Representation createRepresentation(URLConnection uRLConnection, InputStream inputStream) throws IOException {
                return new Representation(uRLConnection, null);
            }
        });
    }

    public static Representation<byte[]> fetchBinary(URL url) throws IOException {
        return fetchBinary(url, 500, 500);
    }

    public static <E> Representation<E> fetch(URL url, int i, int i2, RepresentationFactory<E> representationFactory) throws IOException {
        return fetch(url, "GET", i, i2, representationFactory);
    }
}
