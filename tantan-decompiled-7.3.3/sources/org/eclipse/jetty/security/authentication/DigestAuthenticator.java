package org.eclipse.jetty.security.authentication;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.security.Authenticator;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.UserAuthentication;
import org.eclipse.jetty.server.Authentication;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.QuotedStringTokenizer;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;
import p153l.gse0;
import p153l.lse0;

/* JADX INFO: loaded from: classes2.dex */
public class DigestAuthenticator extends LoginAuthenticator {
    private static final Logger LOG = Log.getLogger((Class<?>) DigestAuthenticator.class);
    SecureRandom _random = new SecureRandom();
    private long _maxNonceAgeMs = Constants.ONE_MIN_IN_MILLIS;
    private ConcurrentMap<String, Nonce> _nonceCount = new ConcurrentHashMap();
    private Queue<Nonce> _nonceQueue = new ConcurrentLinkedQueue();

    public static class Digest extends Credential {
        private static final long serialVersionUID = -2484639019549527724L;
        final String method;
        String username = "";
        String realm = "";
        String nonce = "";

        /* JADX INFO: renamed from: nc */
        String f206820nc = "";
        String cnonce = "";
        String qop = "";
        String uri = "";
        String response = "";

        public Digest(String str) {
            this.method = str;
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            String string = obj instanceof String ? (String) obj : obj.toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (obj instanceof Credential.MD5) {
                    bArrDigest = ((Credential.MD5) obj).getDigest();
                } else {
                    messageDigest.update(this.username.getBytes("ISO-8859-1"));
                    messageDigest.update(HttpTokens.COLON);
                    messageDigest.update(this.realm.getBytes("ISO-8859-1"));
                    messageDigest.update(HttpTokens.COLON);
                    messageDigest.update(string.getBytes("ISO-8859-1"));
                    bArrDigest = messageDigest.digest();
                }
                messageDigest.reset();
                messageDigest.update(this.method.getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(this.uri.getBytes("ISO-8859-1"));
                byte[] bArrDigest2 = messageDigest.digest();
                messageDigest.update(TypeUtil.toString(bArrDigest, 16).getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(this.nonce.getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(this.f206820nc.getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(this.cnonce.getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(this.qop.getBytes("ISO-8859-1"));
                messageDigest.update(HttpTokens.COLON);
                messageDigest.update(TypeUtil.toString(bArrDigest2, 16).getBytes("ISO-8859-1"));
                return TypeUtil.toString(messageDigest.digest(), 16).equalsIgnoreCase(this.response);
            } catch (Exception e) {
                DigestAuthenticator.LOG.warn(e);
                return false;
            }
        }

        public String toString() {
            return this.username + Constants.SEPARATOR_COMMA + this.response;
        }
    }

    public static class Nonce {
        AtomicInteger _nc = new AtomicInteger();
        final String _nonce;
        final long _ts;

        public Nonce(String str, long j) {
            this._nonce = str;
            this._ts = j;
        }
    }

    private int checkNonce(Digest digest, Request request) {
        long timeStamp;
        synchronized (this) {
            timeStamp = request.getTimeStamp() - this._maxNonceAgeMs;
        }
        Nonce noncePeek = this._nonceQueue.peek();
        while (noncePeek != null && noncePeek._ts < timeStamp) {
            this._nonceQueue.remove(noncePeek);
            this._nonceCount.remove(noncePeek._nonce);
            noncePeek = this._nonceQueue.peek();
        }
        try {
            Nonce nonce = this._nonceCount.get(digest.nonce);
            if (nonce == null) {
                return 0;
            }
            long j = Long.parseLong(digest.f206820nc, 16);
            if (j > 2147483647L) {
                return 0;
            }
            int i = nonce._nc.get();
            while (!nonce._nc.compareAndSet(i, (int) j)) {
                i = nonce._nc.get();
            }
            return j <= ((long) i) ? -1 : 1;
        } catch (Exception e) {
            LOG.ignore(e);
            return -1;
        }
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public String getAuthMethod() {
        return Constraint.__DIGEST_AUTH;
    }

    public String newNonce(Request request) {
        Nonce nonce;
        do {
            byte[] bArr = new byte[24];
            this._random.nextBytes(bArr);
            nonce = new Nonce(new String(B64Code.encode(bArr)), request.getTimeStamp());
        } while (this._nonceCount.putIfAbsent(nonce._nonce, nonce) != null);
        this._nonceQueue.add(nonce);
        return nonce._nonce;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public boolean secureResponse(gse0 gse0Var, lse0 lse0Var, boolean z, Authentication.User user) throws ServerAuthException {
        return true;
    }

    @Override // org.eclipse.jetty.security.authentication.LoginAuthenticator, org.eclipse.jetty.security.Authenticator
    public void setConfiguration(Authenticator.AuthConfiguration authConfiguration) {
        super.setConfiguration(authConfiguration);
        String initParameter = authConfiguration.getInitParameter("maxNonceAge");
        if (initParameter != null) {
            synchronized (this) {
                this._maxNonceAgeMs = Long.valueOf(initParameter).longValue();
            }
        }
    }

    public synchronized void setMaxNonceAge(long j) {
        this._maxNonceAgeMs = j;
    }

    @Override // org.eclipse.jetty.security.Authenticator
    public Authentication validateRequest(gse0 gse0Var, lse0 lse0Var, boolean z) throws ServerAuthException {
        if (!z) {
            return new DeferredAuthentication(this);
        }
        HttpServletRequest httpServletRequest = (HttpServletRequest) gse0Var;
        HttpServletResponse httpServletResponse = (HttpServletResponse) lse0Var;
        String header = httpServletRequest.getHeader("Authorization");
        boolean z2 = false;
        if (header != null) {
            try {
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Credentials: ".concat(header), new Object[0]);
                }
                QuotedStringTokenizer quotedStringTokenizer = new QuotedStringTokenizer(header, "=, ", true, false);
                Digest digest = new Digest(httpServletRequest.getMethod());
                String str = null;
                String str2 = null;
                while (quotedStringTokenizer.hasMoreTokens()) {
                    String strNextToken = quotedStringTokenizer.nextToken();
                    char cCharAt = strNextToken.length() == 1 ? strNextToken.charAt(0) : (char) 0;
                    if (cCharAt != ' ') {
                        if (cCharAt != ',') {
                            if (cCharAt == '=') {
                                str2 = str;
                            } else if (str2 != null) {
                                if ("username".equalsIgnoreCase(str2)) {
                                    digest.username = strNextToken;
                                } else if ("realm".equalsIgnoreCase(str2)) {
                                    digest.realm = strNextToken;
                                } else if ("nonce".equalsIgnoreCase(str2)) {
                                    digest.nonce = strNextToken;
                                } else if ("nc".equalsIgnoreCase(str2)) {
                                    digest.f206820nc = strNextToken;
                                } else if ("cnonce".equalsIgnoreCase(str2)) {
                                    digest.cnonce = strNextToken;
                                } else if ("qop".equalsIgnoreCase(str2)) {
                                    digest.qop = strNextToken;
                                } else if ("uri".equalsIgnoreCase(str2)) {
                                    digest.uri = strNextToken;
                                } else if ("response".equalsIgnoreCase(str2)) {
                                    digest.response = strNextToken;
                                }
                                str2 = null;
                            }
                            str = strNextToken;
                        } else {
                            str2 = null;
                        }
                    }
                }
                int iCheckNonce = checkNonce(digest, (Request) httpServletRequest);
                if (iCheckNonce > 0) {
                    UserIdentity userIdentityLogin = login(digest.username, digest, gse0Var);
                    if (userIdentityLogin != null) {
                        return new UserAuthentication(getAuthMethod(), userIdentityLogin);
                    }
                } else if (iCheckNonce == 0) {
                    z2 = true;
                }
            } catch (IOException e) {
                throw new ServerAuthException(e);
            }
        }
        if (DeferredAuthentication.isDeferred(httpServletResponse)) {
            return Authentication.UNAUTHENTICATED;
        }
        String contextPath = httpServletRequest.getContextPath();
        if (contextPath == null) {
            contextPath = "/";
        }
        httpServletResponse.setHeader(HttpHeaders.WWW_AUTHENTICATE, "Digest realm=\"" + this._loginService.getName() + "\", domain=\"" + contextPath + "\", nonce=\"" + newNonce((Request) httpServletRequest) + "\", algorithm=MD5, qop=\"auth\", stale=" + z2);
        httpServletResponse.sendError(401);
        return Authentication.SEND_CONTINUE;
    }
}
