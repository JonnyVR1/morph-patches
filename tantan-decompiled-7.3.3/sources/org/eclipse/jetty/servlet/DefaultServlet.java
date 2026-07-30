package org.eclipse.jetty.servlet;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpContent;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.ByteArrayBuffer;
import org.eclipse.jetty.p127io.WriterOutputStream;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.HttpOutput;
import org.eclipse.jetty.server.InclusiveByteRange;
import org.eclipse.jetty.server.ResourceCache;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.nio.NIOConnector;
import org.eclipse.jetty.server.ssl.SslConnector;
import org.eclipse.jetty.util.C22074IO;
import org.eclipse.jetty.util.MultiPartOutputStream;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.FileResource;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.util.resource.ResourceFactory;
import p153l.ase0;
import p153l.c2d0;
import p153l.p7f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultServlet extends HttpServlet implements ResourceFactory {
    private static final Logger LOG = Log.getLogger((Class<?>) DefaultServlet.class);
    private static final long serialVersionUID = 4930458713846881193L;
    private ResourceCache _cache;
    private ByteArrayBuffer _cacheControl;
    private ContextHandler _contextHandler;
    private ServletHolder _defaultHolder;
    private MimeTypes _mimeTypes;
    private String _relativeResourceBase;
    private Resource _resourceBase;
    private ase0 _servletContext;
    private ServletHandler _servletHandler;
    private Resource _stylesheet;
    private String[] _welcomes;
    private boolean _acceptRanges = true;
    private boolean _dirAllowed = true;
    private boolean _welcomeServlets = false;
    private boolean _welcomeExactServlets = false;
    private boolean _redirectWelcome = false;
    private boolean _gzip = true;
    private boolean _pathInfoOnly = false;
    private boolean _useFileMappedBuffer = false;

    private boolean getInitBoolean(String str, boolean z) {
        String initParameter = getInitParameter(str);
        if (initParameter == null || initParameter.length() == 0) {
            return z;
        }
        return initParameter.startsWith(Constants.KEY_T) || initParameter.startsWith(p7f.GPS_DIRECTION_TRUE) || initParameter.startsWith(BaseSei.f14625Y) || initParameter.startsWith("Y") || initParameter.startsWith("1");
    }

    private int getInitInt(String str, int i) {
        String initParameter = getInitParameter(str);
        if (initParameter == null) {
            initParameter = getInitParameter(str);
        }
        return (initParameter == null || initParameter.length() <= 0) ? i : Integer.parseInt(initParameter);
    }

    private String getWelcomeFile(String str) throws IOException {
        PathMap.Entry holderEntry;
        String str2 = null;
        if (this._welcomes == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = this._welcomes;
            if (i >= strArr.length) {
                return str2;
            }
            String strAddPaths = URIUtil.addPaths(str, strArr[i]);
            Resource resource = getResource(strAddPaths);
            if (resource != null && resource.exists()) {
                return this._welcomes[i];
            }
            if ((this._welcomeServlets || this._welcomeExactServlets) && str2 == null && (holderEntry = this._servletHandler.getHolderEntry(strAddPaths)) != null && holderEntry.getValue() != this._defaultHolder && (this._welcomeServlets || (this._welcomeExactServlets && holderEntry.getKey().equals(strAddPaths)))) {
                str2 = strAddPaths;
            }
            i++;
        }
    }

    private boolean hasDefinedRange(Enumeration<String> enumeration) {
        return enumeration != null && enumeration.hasMoreElements();
    }

    @Override // javax.servlet.GenericServlet, p153l.yre0
    public void destroy() {
        ResourceCache resourceCache = this._cache;
        if (resourceCache != null) {
            resourceCache.flushCache();
        }
        super.destroy();
    }

    /* JADX WARN: Code duplicated, block: B:188:0x02ef A[Catch: all -> 0x0202, IllegalArgumentException -> 0x0205, TRY_LEAVE, TryCatch #17 {IllegalArgumentException -> 0x0205, all -> 0x0202, blocks: (B:129:0x01f2, B:131:0x01f8, B:138:0x0209, B:140:0x020f, B:142:0x021c, B:144:0x0225, B:146:0x022b, B:147:0x0252, B:148:0x0265, B:150:0x026b, B:152:0x0271, B:153:0x0276, B:154:0x0280, B:166:0x02a8, B:167:0x02ac, B:183:0x02e5, B:186:0x02e9, B:188:0x02ef, B:195:0x0300, B:196:0x0311, B:168:0x02ad, B:170:0x02b7, B:174:0x02c0, B:176:0x02c6, B:178:0x02cc, B:179:0x02d4, B:180:0x02e2, B:173:0x02bd), top: B:218:0x0138, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:192:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:195:0x0300 A[Catch: all -> 0x0202, IllegalArgumentException -> 0x0205, TRY_ENTER, TryCatch #17 {IllegalArgumentException -> 0x0205, all -> 0x0202, blocks: (B:129:0x01f2, B:131:0x01f8, B:138:0x0209, B:140:0x020f, B:142:0x021c, B:144:0x0225, B:146:0x022b, B:147:0x0252, B:148:0x0265, B:150:0x026b, B:152:0x0271, B:153:0x0276, B:154:0x0280, B:166:0x02a8, B:167:0x02ac, B:183:0x02e5, B:186:0x02e9, B:188:0x02ef, B:195:0x0300, B:196:0x0311, B:168:0x02ad, B:170:0x02b7, B:174:0x02c0, B:176:0x02c6, B:178:0x02cc, B:179:0x02d4, B:180:0x02e2, B:173:0x02bd), top: B:218:0x0138, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x031f A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:74:0x0103, B:76:0x010b, B:84:0x012c, B:86:0x013a, B:89:0x0143, B:92:0x014b, B:94:0x0153, B:96:0x0159, B:98:0x0168, B:100:0x016e, B:101:0x0182, B:103:0x0198, B:107:0x01b2, B:112:0x01be, B:114:0x01cd, B:197:0x0312, B:199:0x031f), top: B:210:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x032a  */
    /* JADX WARN: Code duplicated, block: B:202:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0330  */
    /* JADX WARN: Code duplicated, block: B:206:0x0336 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x0338  */
    /* JADX WARN: Code duplicated, block: B:208:0x033c  */
    /* JADX WARN: Code duplicated, block: B:215:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0138 A[EXC_TOP_SPLITTER, PHI: r4
      0x0138: PHI (r4v8 ??) = (r4v34 ??), (r4v35 ??) binds: [B:75:0x0109, B:84:0x012c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7 A[Catch: all -> 0x00ad, IllegalArgumentException -> 0x00b1, TryCatch #15 {IllegalArgumentException -> 0x00b1, all -> 0x00ad, blocks: (B:35:0x0092, B:37:0x00a7, B:42:0x00b5), top: B:221:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: all -> 0x00ad, IllegalArgumentException -> 0x00b1, TRY_LEAVE, TryCatch #15 {IllegalArgumentException -> 0x00b1, all -> 0x00ad, blocks: (B:35:0x0092, B:37:0x00a7, B:42:0x00b5), top: B:221:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: all -> 0x00d5, IllegalArgumentException -> 0x00da, TryCatch #14 {IllegalArgumentException -> 0x00da, all -> 0x00d5, blocks: (B:48:0x00c8, B:50:0x00ce, B:65:0x00ed, B:67:0x00f1, B:68:0x00f6, B:71:0x00fd), top: B:222:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed A[Catch: all -> 0x00d5, IllegalArgumentException -> 0x00da, TryCatch #14 {IllegalArgumentException -> 0x00da, all -> 0x00d5, blocks: (B:48:0x00c8, B:50:0x00ce, B:65:0x00ed, B:67:0x00f1, B:68:0x00f6, B:71:0x00fd), top: B:222:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1 A[Catch: all -> 0x00d5, IllegalArgumentException -> 0x00da, TryCatch #14 {IllegalArgumentException -> 0x00da, all -> 0x00d5, blocks: (B:48:0x00c8, B:50:0x00ce, B:65:0x00ed, B:67:0x00f1, B:68:0x00f6, B:71:0x00fd), top: B:222:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6 A[Catch: all -> 0x00d5, IllegalArgumentException -> 0x00da, TryCatch #14 {IllegalArgumentException -> 0x00da, all -> 0x00d5, blocks: (B:48:0x00c8, B:50:0x00ce, B:65:0x00ed, B:67:0x00f1, B:68:0x00f6, B:71:0x00fd), top: B:222:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[Catch: all -> 0x00d5, IllegalArgumentException -> 0x00da, TRY_LEAVE, TryCatch #14 {IllegalArgumentException -> 0x00da, all -> 0x00d5, blocks: (B:48:0x00c8, B:50:0x00ce, B:65:0x00ed, B:67:0x00f1, B:68:0x00f6, B:71:0x00fd), top: B:222:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a A[Catch: all -> 0x0124, IllegalArgumentException -> 0x02e6, TRY_ENTER, TryCatch #2 {all -> 0x0124, blocks: (B:74:0x0103, B:76:0x010b, B:84:0x012c, B:86:0x013a, B:89:0x0143, B:92:0x014b, B:94:0x0153, B:96:0x0159, B:98:0x0168, B:100:0x016e, B:101:0x0182, B:103:0x0198, B:107:0x01b2, B:112:0x01be, B:114:0x01cd, B:197:0x0312, B:199:0x031f), top: B:210:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x0300, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [org.eclipse.jetty.servlet.DefaultServlet] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [org.eclipse.jetty.util.resource.Resource] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, org.eclipse.jetty.util.resource.Resource] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.eclipse.jetty.util.resource.Resource] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [org.eclipse.jetty.util.resource.Resource] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // javax.servlet.http.HttpServlet
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        String servletPath;
        String pathInfo;
        Enumeration<String> headers;
        String strAddPaths;
        boolean z;
        ?? r4;
        HttpContent resourceAsHttpContent;
        ?? r5;
        String str;
        ResourceCache resourceCache;
        HttpContent httpContentLookup;
        Resource resource;
        Resource resource2;
        boolean z2;
        Logger logger;
        ?? r6;
        ?? r7;
        Resource resource3;
        HttpContent httpContent;
        Resource resource4;
        String str2;
        ResourceCache resourceCache2;
        String str3 = "uri=";
        boolean z3 = httpServletRequest.getAttribute("javax.servlet.include.request_uri") != null;
        Boolean boolValueOf = Boolean.valueOf(z3);
        HttpContent resourceAsHttpContent2 = null;
        Resource resource5 = null;
         = 0;
        ?? r9 = 0;
        try {
            try {
                if (!z3) {
                    boolValueOf = Boolean.FALSE;
                    servletPath = this._pathInfoOnly ? "/" : httpServletRequest.getServletPath();
                    pathInfo = httpServletRequest.getPathInfo();
                    headers = httpServletRequest.getHeaders("Range");
                    if (!hasDefinedRange(headers)) {
                    }
                    strAddPaths = URIUtil.addPaths(servletPath, pathInfo);
                    if (pathInfo == null) {
                        pathInfo = httpServletRequest.getServletPath();
                    }
                    boolean zEndsWith = pathInfo.endsWith("/");
                    if (boolValueOf.booleanValue() && this._gzip && headers == null && !zEndsWith) {
                        httpServletResponse.setHeader(HttpHeaders.VARY, HttpHeaders.ACCEPT_ENCODING);
                        String header = httpServletRequest.getHeader(HttpHeaders.ACCEPT_ENCODING);
                        if (header == null || header.indexOf(HttpHeaderValues.GZIP) < 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            str = strAddPaths + ".gz";
                            resourceCache = this._cache;
                            if (resourceCache == null) {
                                resource2 = getResource(str);
                                resourceAsHttpContent = null;
                            } else {
                                httpContentLookup = resourceCache.lookup(str);
                                if (httpContentLookup == null) {
                                    resource = null;
                                } else {
                                    try {
                                        resource = httpContentLookup.getResource();
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        resourceAsHttpContent = httpContentLookup;
                                        LOG.warn(Log.EXCEPTION, e);
                                        if (!httpServletResponse.isCommitted()) {
                                            httpServletResponse.sendError(500, e.getMessage());
                                        }
                                        if (resourceAsHttpContent != null) {
                                            resourceAsHttpContent.release();
                                            return;
                                        } else {
                                            if (r9 != 0) {
                                                r9.release();
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = 0;
                                        resourceAsHttpContent2 = httpContentLookup;
                                    }
                                }
                                Resource resource6 = resource;
                                resourceAsHttpContent = httpContentLookup;
                                resource2 = resource6;
                            }
                            if (resource2 == null) {
                                try {
                                    if (!resource2.exists()) {
                                        z2 = false;
                                    } else if (resource2.isDirectory()) {
                                        z2 = z;
                                        z2 = false;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    r9 = resource2;
                                    LOG.warn(Log.EXCEPTION, e);
                                    if (!httpServletResponse.isCommitted()) {
                                        httpServletResponse.sendError(500, e.getMessage());
                                    }
                                    if (resourceAsHttpContent != null) {
                                        resourceAsHttpContent.release();
                                        return;
                                    } else {
                                        if (r9 != 0) {
                                            r9.release();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r4 = resource2;
                                    resourceAsHttpContent2 = resourceAsHttpContent;
                                    r5 = r4;
                                    if (resourceAsHttpContent2 != null) {
                                        resourceAsHttpContent2.release();
                                    } else if (r5 != 0) {
                                        r5.release();
                                    }
                                    throw th;
                                }
                            } else {
                                z2 = false;
                            }
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            resourceAsHttpContent = null;
                        } catch (Throwable th3) {
                            th = th3;
                            r5 = 0;
                        }
                        if (resourceAsHttpContent2 != null) {
                            resourceAsHttpContent2.release();
                        } else if (r5 != 0) {
                            r5.release();
                        }
                        throw th;
                    }
                    resource2 = null;
                    resourceAsHttpContent = null;
                    if (z2) {
                        z2 = z;
                        resource5 = resource2;
                    } else {
                        resourceCache2 = this._cache;
                        if (resourceCache2 == null) {
                            z2 = z;
                            resource5 = getResource(strAddPaths);
                        } else {
                            resourceAsHttpContent = resourceCache2.lookup(strAddPaths);
                            if (resourceAsHttpContent == null) {
                                z2 = z;
                            } else {
                                z2 = z;
                                resource5 = resourceAsHttpContent.getResource();
                            }
                        }
                    }
                    logger = LOG;
                    r6 = str3;
                    if (logger.isDebugEnabled()) {
                        if (resource5 != null) {
                            r7 = resource5;
                            if (boolValueOf.booleanValue()) {
                                throw new FileNotFoundException("!" + strAddPaths);
                            }
                            httpServletResponse.sendError(404);
                        } else {
                            r7 = resource5;
                            if (boolValueOf.booleanValue()) {
                                throw new FileNotFoundException("!" + strAddPaths);
                            }
                            httpServletResponse.sendError(404);
                        }
                        if (resourceAsHttpContent != null) {
                            r7 = r6;
                            resourceAsHttpContent.release();
                            return;
                        } else {
                            if (r7 != 0) {
                                r7.release();
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        StringBuilder sb = new StringBuilder("uri=");
                        sb.append(httpServletRequest.getRequestURI());
                        sb.append(" resource=");
                        sb.append(resource5);
                        if (resourceAsHttpContent != null) {
                            str2 = " content";
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        String string = sb.toString();
                        logger.debug(string, new Object[0]);
                        r6 = string;
                        try {
                            if (resource5 != null || !resource5.exists()) {
                                r7 = resource5;
                                if (boolValueOf.booleanValue()) {
                                    throw new FileNotFoundException("!" + strAddPaths);
                                }
                                httpServletResponse.sendError(404);
                            } else if (resource5.isDirectory()) {
                                r6 = resource5;
                                if (!zEndsWith || (strAddPaths.length() == 1 && httpServletRequest.getAttribute("org.eclipse.jetty.server.nullPathInfo") != null)) {
                                    StringBuffer requestURL = httpServletRequest.getRequestURL();
                                    synchronized (requestURL) {
                                        try {
                                            int iLastIndexOf = requestURL.lastIndexOf(com.meituan.robust.Constants.PACKNAME_END);
                                            if (iLastIndexOf < 0) {
                                                requestURL.append('/');
                                            } else {
                                                requestURL.insert(iLastIndexOf, '/');
                                            }
                                            String queryString = httpServletRequest.getQueryString();
                                            if (queryString != null && queryString.length() != 0) {
                                                requestURL.append('?');
                                                requestURL.append(queryString);
                                            }
                                            httpServletResponse.setContentLength(0);
                                            httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(requestURL.toString()));
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    r7 = r6;
                                } else {
                                    String welcomeFile = getWelcomeFile(strAddPaths);
                                    if (welcomeFile != null) {
                                        logger.debug("welcome={}", welcomeFile);
                                        if (this._redirectWelcome) {
                                            httpServletResponse.setContentLength(0);
                                            String queryString2 = httpServletRequest.getQueryString();
                                            if (queryString2 == null || queryString2.length() == 0) {
                                                httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(this._servletContext.getContextPath(), welcomeFile)));
                                                r7 = r6;
                                            } else {
                                                httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(this._servletContext.getContextPath(), welcomeFile) + "?" + queryString2));
                                            }
                                        } else {
                                            c2d0 requestDispatcher = httpServletRequest.getRequestDispatcher(welcomeFile);
                                            if (requestDispatcher != null) {
                                                if (boolValueOf.booleanValue()) {
                                                    r7 = r6;
                                                    requestDispatcher.include(httpServletRequest, httpServletResponse);
                                                    r7 = r6;
                                                } else {
                                                    r7 = r6;
                                                    httpServletRequest.setAttribute("org.eclipse.jetty.server.welcome", welcomeFile);
                                                    requestDispatcher.forward(httpServletRequest, httpServletResponse);
                                                    r7 = r6;
                                                }
                                            }
                                        }
                                    } else {
                                        resourceAsHttpContent2 = new HttpContent.ResourceAsHttpContent(r6, this._mimeTypes.getMimeByExtension(r6.toString()));
                                        try {
                                            if (boolValueOf.booleanValue() || passConditionalHeaders(httpServletRequest, httpServletResponse, r6, resourceAsHttpContent2)) {
                                                sendDirectory(httpServletRequest, httpServletResponse, r6, strAddPaths);
                                            }
                                            resourceAsHttpContent = resourceAsHttpContent2;
                                            r7 = r6;
                                        } catch (IllegalArgumentException e4) {
                                            e = e4;
                                            resourceAsHttpContent = resourceAsHttpContent2;
                                            r9 = r6;
                                            LOG.warn(Log.EXCEPTION, e);
                                            if (!httpServletResponse.isCommitted()) {
                                                httpServletResponse.sendError(500, e.getMessage());
                                            }
                                            if (resourceAsHttpContent != null) {
                                                resourceAsHttpContent.release();
                                                return;
                                            } else {
                                                if (r9 != 0) {
                                                    r9.release();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            r5 = r6;
                                        }
                                    }
                                }
                            } else if (zEndsWith && this._contextHandler.isAliases() && strAddPaths.length() > 1) {
                                String queryString3 = httpServletRequest.getQueryString();
                                String strSubstring = strAddPaths.substring(0, strAddPaths.length() - 1);
                                if (queryString3 != null && queryString3.length() != 0) {
                                    strSubstring = strSubstring + "?" + queryString3;
                                }
                                httpServletResponse.sendRedirect(httpServletResponse.encodeRedirectURL(URIUtil.addPaths(this._servletContext.getContextPath(), strSubstring)));
                                r7 = resource5;
                            } else {
                                if (resourceAsHttpContent == null) {
                                    resourceAsHttpContent = new HttpContent.ResourceAsHttpContent(resource5, this._mimeTypes.getMimeByExtension(resource5.toString()), httpServletResponse.getBufferSize());
                                }
                                try {
                                    if (boolValueOf.booleanValue() || passConditionalHeaders(httpServletRequest, httpServletResponse, resource5, resourceAsHttpContent)) {
                                        if (z2) {
                                            httpServletResponse.setHeader("Content-Encoding", HttpHeaderValues.GZIP);
                                            String mimeType = this._servletContext.getMimeType(strAddPaths);
                                            if (mimeType != null) {
                                                httpServletResponse.setContentType(mimeType);
                                            }
                                        }
                                        resource3 = resource5;
                                        httpContent = resourceAsHttpContent;
                                        try {
                                            sendData(httpServletRequest, httpServletResponse, boolValueOf.booleanValue(), resource3, httpContent, headers);
                                            resource4 = resource3;
                                        } catch (IllegalArgumentException e5) {
                                            e = e5;
                                            r9 = resource3;
                                            resourceAsHttpContent = httpContent;
                                            LOG.warn(Log.EXCEPTION, e);
                                            if (!httpServletResponse.isCommitted()) {
                                                httpServletResponse.sendError(500, e.getMessage());
                                            }
                                            if (resourceAsHttpContent != null) {
                                                resourceAsHttpContent.release();
                                                return;
                                            } else {
                                                if (r9 != 0) {
                                                    r9.release();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            resourceAsHttpContent2 = httpContent;
                                            r5 = resource3;
                                            if (resourceAsHttpContent2 != null) {
                                                resourceAsHttpContent2.release();
                                            } else if (r5 != 0) {
                                                r5.release();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        resource4 = resource5;
                                        httpContent = resourceAsHttpContent;
                                    }
                                    resourceAsHttpContent = httpContent;
                                    r7 = resource4;
                                } catch (IllegalArgumentException e6) {
                                    e = e6;
                                    r9 = resource5;
                                } catch (Throwable th7) {
                                    th = th7;
                                    resource3 = resource5;
                                    httpContent = resourceAsHttpContent;
                                }
                            }
                            if (resourceAsHttpContent != null) {
                                r7 = r6;
                                resourceAsHttpContent.release();
                                return;
                            } else {
                                if (r7 != 0) {
                                    r7.release();
                                    return;
                                }
                                return;
                            }
                        } catch (IllegalArgumentException e7) {
                            e = e7;
                            r9 = r6;
                            LOG.warn(Log.EXCEPTION, e);
                            if (!httpServletResponse.isCommitted()) {
                                httpServletResponse.sendError(500, e.getMessage());
                            }
                            if (resourceAsHttpContent != null) {
                                resourceAsHttpContent.release();
                                return;
                            } else {
                                if (r9 != 0) {
                                    r9.release();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r4 = r6;
                            resourceAsHttpContent2 = resourceAsHttpContent;
                            r5 = r4;
                            if (resourceAsHttpContent2 != null) {
                                resourceAsHttpContent2.release();
                            } else if (r5 != 0) {
                                r5.release();
                            }
                            throw th;
                        }
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        r9 = resource5;
                        LOG.warn(Log.EXCEPTION, e);
                        if (!httpServletResponse.isCommitted()) {
                            httpServletResponse.sendError(500, e.getMessage());
                        }
                        if (resourceAsHttpContent != null) {
                            resourceAsHttpContent.release();
                            return;
                        } else {
                            if (r9 != 0) {
                                r9.release();
                                return;
                            }
                            return;
                        }
                    }
                    if (resourceAsHttpContent2 != null) {
                        resourceAsHttpContent2.release();
                    } else if (r5 != 0) {
                        r5.release();
                    }
                    throw th;
                }
                servletPath = (String) httpServletRequest.getAttribute("javax.servlet.include.servlet_path");
                pathInfo = (String) httpServletRequest.getAttribute("javax.servlet.include.path_info");
                if (servletPath == null) {
                    servletPath = httpServletRequest.getServletPath();
                    pathInfo = httpServletRequest.getPathInfo();
                }
                logger = LOG;
                r6 = str3;
                if (logger.isDebugEnabled()) {
                    if (resource5 != null) {
                        r7 = resource5;
                        if (boolValueOf.booleanValue()) {
                            throw new FileNotFoundException("!" + strAddPaths);
                        }
                        httpServletResponse.sendError(404);
                    } else {
                        r7 = resource5;
                        if (boolValueOf.booleanValue()) {
                            throw new FileNotFoundException("!" + strAddPaths);
                        }
                        httpServletResponse.sendError(404);
                    }
                    if (resourceAsHttpContent != null) {
                        r7 = r6;
                        resourceAsHttpContent.release();
                        return;
                    } else {
                        if (r7 != 0) {
                            r7.release();
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder("uri=");
                sb2.append(httpServletRequest.getRequestURI());
                sb2.append(" resource=");
                sb2.append(resource5);
                if (resourceAsHttpContent != null) {
                    str2 = " content";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                String string2 = sb2.toString();
                logger.debug(string2, new Object[0]);
                r6 = string2;
                if (resource5 != null) {
                    r7 = resource5;
                    if (boolValueOf.booleanValue()) {
                        throw new FileNotFoundException("!" + strAddPaths);
                    }
                    httpServletResponse.sendError(404);
                } else {
                    r7 = resource5;
                    if (boolValueOf.booleanValue()) {
                        throw new FileNotFoundException("!" + strAddPaths);
                    }
                    httpServletResponse.sendError(404);
                }
                if (resourceAsHttpContent != null) {
                    r7 = r6;
                    resourceAsHttpContent.release();
                    return;
                } else {
                    if (r7 != 0) {
                        r7.release();
                        return;
                    }
                    return;
                }
            } catch (IllegalArgumentException e9) {
                e = e9;
                r9 = resource5;
            }
            if (z) {
                str = strAddPaths + ".gz";
                resourceCache = this._cache;
                if (resourceCache == null) {
                    resource2 = getResource(str);
                    resourceAsHttpContent = null;
                } else {
                    httpContentLookup = resourceCache.lookup(str);
                    if (httpContentLookup == null) {
                        resource = null;
                    } else {
                        resource = httpContentLookup.getResource();
                    }
                    Resource resource7 = resource;
                    resourceAsHttpContent = httpContentLookup;
                    resource2 = resource7;
                }
                if (resource2 == null) {
                    z2 = false;
                } else if (!resource2.exists()) {
                    z2 = false;
                } else if (resource2.isDirectory()) {
                    z2 = z;
                    z2 = false;
                }
                if (resourceAsHttpContent2 != null) {
                    resourceAsHttpContent2.release();
                } else if (r5 != 0) {
                    r5.release();
                }
                throw th;
            }
            resource2 = null;
            resourceAsHttpContent = null;
            if (z2) {
                resourceCache2 = this._cache;
                if (resourceCache2 == null) {
                    z2 = z;
                    resource5 = getResource(strAddPaths);
                } else {
                    resourceAsHttpContent = resourceCache2.lookup(strAddPaths);
                    if (resourceAsHttpContent == null) {
                        z2 = z;
                    } else {
                        z2 = z;
                        resource5 = resourceAsHttpContent.getResource();
                    }
                }
            } else {
                z2 = z;
                resource5 = resource2;
            }
        } catch (Throwable th9) {
            th = th9;
            r4 = 0;
        }
        headers = null;
        strAddPaths = URIUtil.addPaths(servletPath, pathInfo);
        if (pathInfo == null) {
            pathInfo = httpServletRequest.getServletPath();
        }
        boolean zEndsWith2 = pathInfo.endsWith("/");
        if (boolValueOf.booleanValue()) {
            z = false;
        } else {
            z = false;
        }
        if (resourceAsHttpContent2 != null) {
            resourceAsHttpContent2.release();
        } else if (r5 != 0) {
            r5.release();
        }
        throw th;
    }

    @Override // javax.servlet.http.HttpServlet
    public void doOptions(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setHeader(HttpHeaders.ALLOW, "GET,HEAD,POST,OPTIONS");
    }

    @Override // javax.servlet.http.HttpServlet
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable {
        doGet(httpServletRequest, httpServletResponse);
    }

    @Override // javax.servlet.http.HttpServlet
    public void doTrace(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.sendError(HttpStatus.METHOD_NOT_ALLOWED_405);
    }

    @Override // javax.servlet.GenericServlet, p153l.zre0
    public String getInitParameter(String str) {
        String initParameter = getServletContext().getInitParameter("org.eclipse.jetty.servlet.Default." + str);
        return initParameter == null ? super.getInitParameter(str) : initParameter;
    }

    @Override // org.eclipse.jetty.util.resource.ResourceFactory
    public Resource getResource(String str) {
        String str2 = this._relativeResourceBase;
        if (str2 != null) {
            str = URIUtil.addPaths(str2, str);
        }
        Resource resourceNewResource = null;
        try {
            Resource resource = this._resourceBase;
            if (resource != null) {
                resourceNewResource = resource.addPath(str);
            } else {
                resourceNewResource = this._contextHandler.newResource(this._servletContext.getResource(str));
            }
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Resource " + str + "=" + resourceNewResource, new Object[0]);
            }
        } catch (IOException e) {
            LOG.ignore(e);
        }
        return ((resourceNewResource == null || !resourceNewResource.exists()) && str.endsWith("/jetty-dir.css")) ? this._stylesheet : resourceNewResource;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0110 A[Catch: Exception -> 0x010a, TRY_LEAVE, TryCatch #1 {Exception -> 0x010a, blocks: (B:34:0x00f0, B:36:0x00fc, B:39:0x010c, B:41:0x0110), top: B:86:0x00f0 }] */
    @Override // javax.servlet.GenericServlet
    public void init() throws UnavailableException {
        ase0 servletContext = getServletContext();
        this._servletContext = servletContext;
        ContextHandler contextHandlerInitContextHandler = initContextHandler(servletContext);
        this._contextHandler = contextHandlerInitContextHandler;
        this._mimeTypes = contextHandlerInitContextHandler.getMimeTypes();
        String[] welcomeFiles = this._contextHandler.getWelcomeFiles();
        this._welcomes = welcomeFiles;
        if (welcomeFiles == null) {
            this._welcomes = new String[]{"index.html", "index.jsp"};
        }
        this._acceptRanges = getInitBoolean("acceptRanges", this._acceptRanges);
        this._dirAllowed = getInitBoolean("dirAllowed", this._dirAllowed);
        this._redirectWelcome = getInitBoolean("redirectWelcome", this._redirectWelcome);
        this._gzip = getInitBoolean(HttpHeaderValues.GZIP, this._gzip);
        this._pathInfoOnly = getInitBoolean("pathInfoOnly", this._pathInfoOnly);
        if ("exact".equals(getInitParameter("welcomeServlets"))) {
            this._welcomeExactServlets = true;
            this._welcomeServlets = false;
        } else {
            this._welcomeServlets = getInitBoolean("welcomeServlets", this._welcomeServlets);
        }
        if (getInitParameter("aliases") != null) {
            this._contextHandler.setAliases(getInitBoolean("aliases", false));
        }
        boolean zIsAliases = this._contextHandler.isAliases();
        if (!zIsAliases && !FileResource.getCheckAliases()) {
            wtq0.m207906a("Alias checking disabled");
            return;
        }
        if (zIsAliases) {
            this._servletContext.log("Aliases are enabled");
        }
        this._useFileMappedBuffer = getInitBoolean("useFileMappedBuffer", this._useFileMappedBuffer);
        this._relativeResourceBase = getInitParameter("relativeResourceBase");
        String initParameter = getInitParameter("resourceBase");
        if (initParameter != null) {
            if (this._relativeResourceBase != null) {
                throw new UnavailableException("resourceBase & relativeResourceBase");
            }
            try {
                this._resourceBase = this._contextHandler.newResource(initParameter);
            } catch (Exception e) {
                LOG.warn(Log.EXCEPTION, e);
                throw new UnavailableException(e.toString());
            }
        }
        String initParameter2 = getInitParameter("stylesheet");
        if (initParameter2 != null) {
            try {
                Resource resourceNewResource = Resource.newResource(initParameter2);
                this._stylesheet = resourceNewResource;
                if (!resourceNewResource.exists()) {
                    LOG.warn("!".concat(initParameter2), new Object[0]);
                    this._stylesheet = null;
                }
                if (this._stylesheet == null) {
                    this._stylesheet = Resource.newResource(getClass().getResource("/jetty-dir.css"));
                }
            } catch (Exception e2) {
                Logger logger = LOG;
                logger.warn(e2.toString(), new Object[0]);
                logger.debug(e2);
            }
        } else if (this._stylesheet == null) {
            this._stylesheet = Resource.newResource(getClass().getResource("/jetty-dir.css"));
        }
        String initParameter3 = getInitParameter("cacheControl");
        if (initParameter3 != null) {
            this._cacheControl = new ByteArrayBuffer(initParameter3);
        }
        String initParameter4 = getInitParameter("resourceCache");
        int initInt = getInitInt("maxCacheSize", -2);
        int initInt2 = getInitInt("maxCachedFileSize", -2);
        int initInt3 = getInitInt("maxCachedFiles", -2);
        if (initParameter4 != null) {
            if (initInt != -1 || initInt2 != -2 || initInt3 != -2) {
                LOG.debug("ignoring resource cache configuration, using resourceCache attribute", new Object[0]);
            }
            if (this._relativeResourceBase != null || this._resourceBase != null) {
                throw new UnavailableException("resourceCache specified with resource bases");
            }
            ResourceCache resourceCache = (ResourceCache) this._servletContext.getAttribute(initParameter4);
            this._cache = resourceCache;
            LOG.debug("Cache {}={}", initParameter4, resourceCache);
        }
        try {
            if (this._cache == null && initInt3 > 0) {
                ResourceCache resourceCache2 = new ResourceCache(null, this, this._mimeTypes, this._useFileMappedBuffer);
                this._cache = resourceCache2;
                if (initInt > 0) {
                    resourceCache2.setMaxCacheSize(initInt);
                }
                if (initInt2 >= -1) {
                    this._cache.setMaxCachedFileSize(initInt2);
                }
                if (initInt3 >= -1) {
                    this._cache.setMaxCachedFiles(initInt3);
                }
            }
            ServletHandler servletHandler = (ServletHandler) this._contextHandler.getChildHandlerByClass(ServletHandler.class);
            this._servletHandler = servletHandler;
            for (ServletHolder servletHolder : servletHandler.getServlets()) {
                if (servletHolder.getServletInstance() == this) {
                    this._defaultHolder = servletHolder;
                }
            }
            Logger logger2 = LOG;
            if (logger2.isDebugEnabled()) {
                logger2.debug("resource base = " + this._resourceBase, new Object[0]);
            }
        } catch (Exception e3) {
            LOG.warn(Log.EXCEPTION, e3);
            throw new UnavailableException(e3.toString());
        }
    }

    public ContextHandler initContextHandler(ase0 ase0Var) {
        if (ContextHandler.getCurrentContext() != null) {
            return ContextHandler.getCurrentContext().getContextHandler();
        }
        if (ase0Var instanceof ContextHandler.Context) {
            return ((ContextHandler.Context) ase0Var).getContextHandler();
        }
        StringBuilder sb = new StringBuilder("The servletContext ");
        sb.append(ase0Var);
        String name = ase0Var.getClass().getName();
        String name2 = ContextHandler.Context.class.getName();
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(name);
        sb.append(" is not ");
        sb.append(name2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean passConditionalHeaders(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Resource resource, HttpContent httpContent) throws IOException {
        Buffer lastModified;
        try {
            if (!httpServletRequest.getMethod().equals(HttpMethods.HEAD)) {
                String header = httpServletRequest.getHeader("If-Modified-Since");
                if (header != null) {
                    Response response = Response.getResponse(httpServletResponse);
                    if (httpContent != null && (lastModified = httpContent.getLastModified()) != null && header.equals(lastModified.toString())) {
                        response.reset(true);
                        response.setStatus(HttpStatus.NOT_MODIFIED_304);
                        response.flushBuffer();
                        return false;
                    }
                    long dateHeader = httpServletRequest.getDateHeader("If-Modified-Since");
                    if (dateHeader != -1 && resource.lastModified() / 1000 <= dateHeader / 1000) {
                        response.reset(true);
                        response.setStatus(HttpStatus.NOT_MODIFIED_304);
                        response.flushBuffer();
                        return false;
                    }
                }
                long dateHeader2 = httpServletRequest.getDateHeader("If-Unmodified-Since");
                if (dateHeader2 != -1 && resource.lastModified() / 1000 > dateHeader2 / 1000) {
                    httpServletResponse.sendError(HttpStatus.PRECONDITION_FAILED_412);
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            if (httpServletResponse.isCommitted()) {
                throw e;
            }
            httpServletResponse.sendError(400, e.getMessage());
            throw e;
        }
    }

    public void sendData(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, boolean z, Resource resource, HttpContent httpContent, Enumeration enumeration) throws IOException {
        boolean z2;
        long contentLength;
        OutputStream writerOutputStream;
        boolean zIsWritten;
        MultiPartOutputStream multiPartOutputStream;
        int i = 0;
        if (httpContent == null) {
            contentLength = resource.length();
            z2 = false;
        } else {
            Connector connector = AbstractHttpConnection.getCurrentConnection().getConnector();
            z2 = (connector instanceof NIOConnector) && ((NIOConnector) connector).getUseDirectBuffers() && !(connector instanceof SslConnector);
            contentLength = httpContent.getContentLength();
        }
        try {
            writerOutputStream = httpServletResponse.getOutputStream();
            zIsWritten = writerOutputStream instanceof HttpOutput ? ((HttpOutput) writerOutputStream).isWritten() : AbstractHttpConnection.getCurrentConnection().getGenerator().isWritten();
        } catch (IllegalStateException unused) {
            writerOutputStream = new WriterOutputStream(httpServletResponse.getWriter());
            zIsWritten = true;
        }
        OutputStream outputStream = writerOutputStream;
        if (enumeration == null || !enumeration.hasMoreElements() || contentLength < 0) {
            if (z) {
                resource.writeTo(outputStream, 0L, contentLength);
                return;
            }
            if (httpContent == null || zIsWritten || !(outputStream instanceof HttpOutput)) {
                writeHeaders(httpServletResponse, httpContent, zIsWritten ? -1L : contentLength);
                Buffer indirectBuffer = httpContent == null ? null : httpContent.getIndirectBuffer();
                if (indirectBuffer != null) {
                    indirectBuffer.writeTo(outputStream);
                    return;
                } else {
                    resource.writeTo(outputStream, 0L, contentLength);
                    return;
                }
            }
            if (httpServletResponse instanceof Response) {
                writeOptionHeaders(((Response) httpServletResponse).getHttpFields());
                ((AbstractHttpConnection.Output) outputStream).sendContent(httpContent);
                return;
            }
            Buffer directBuffer = z2 ? httpContent.getDirectBuffer() : httpContent.getIndirectBuffer();
            if (directBuffer != null) {
                writeHeaders(httpServletResponse, httpContent, contentLength);
                ((AbstractHttpConnection.Output) outputStream).sendContent(directBuffer);
                return;
            } else {
                writeHeaders(httpServletResponse, httpContent, contentLength);
                resource.writeTo(outputStream, 0L, contentLength);
                return;
            }
        }
        List listSatisfiableRanges = InclusiveByteRange.satisfiableRanges(enumeration, contentLength);
        if (listSatisfiableRanges == null || listSatisfiableRanges.size() == 0) {
            writeHeaders(httpServletResponse, httpContent, contentLength);
            httpServletResponse.setStatus(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416);
            httpServletResponse.setHeader(HttpHeaders.CONTENT_RANGE, InclusiveByteRange.to416HeaderRangeString(contentLength));
            resource.writeTo(outputStream, 0L, contentLength);
            return;
        }
        if (listSatisfiableRanges.size() == 1) {
            InclusiveByteRange inclusiveByteRange = (InclusiveByteRange) listSatisfiableRanges.get(0);
            long size = inclusiveByteRange.getSize(contentLength);
            writeHeaders(httpServletResponse, httpContent, size);
            httpServletResponse.setStatus(206);
            httpServletResponse.setHeader(HttpHeaders.CONTENT_RANGE, inclusiveByteRange.toHeaderRangeString(contentLength));
            resource.writeTo(outputStream, inclusiveByteRange.getFirst(contentLength), size);
            return;
        }
        writeHeaders(httpServletResponse, httpContent, -1L);
        String string = httpContent.getContentType().toString();
        MultiPartOutputStream multiPartOutputStream2 = new MultiPartOutputStream(outputStream);
        httpServletResponse.setStatus(206);
        httpServletResponse.setContentType((httpServletRequest.getHeader(HttpHeaders.REQUEST_RANGE) != null ? "multipart/x-byteranges; boundary=" : "multipart/byteranges; boundary=") + multiPartOutputStream2.getBoundary());
        InputStream inputStream = resource.getInputStream();
        String[] strArr = new String[listSatisfiableRanges.size()];
        int i2 = 0;
        int length = 0;
        while (i2 < listSatisfiableRanges.size()) {
            InclusiveByteRange inclusiveByteRange2 = (InclusiveByteRange) listSatisfiableRanges.get(i2);
            strArr[i2] = inclusiveByteRange2.toHeaderRangeString(contentLength);
            length = (int) (((long) length) + ((long) ((i2 > 0 ? 2 : i) + 2 + multiPartOutputStream2.getBoundary().length() + 16 + string.length() + 17 + strArr[i2].length() + 4)) + (inclusiveByteRange2.getLast(contentLength) - inclusiveByteRange2.getFirst(contentLength)) + 1);
            i2++;
            strArr = strArr;
            i = 0;
        }
        String[] strArr2 = strArr;
        httpServletResponse.setContentLength(length + multiPartOutputStream2.getBoundary().length() + 8);
        long j = 0;
        int i3 = 0;
        while (i3 < listSatisfiableRanges.size()) {
            InclusiveByteRange inclusiveByteRange3 = (InclusiveByteRange) listSatisfiableRanges.get(i3);
            multiPartOutputStream2.startPart(string, new String[]{"Content-Range: " + strArr2[i3]});
            long first = inclusiveByteRange3.getFirst(contentLength);
            long size2 = inclusiveByteRange3.getSize(contentLength);
            if (inputStream != null) {
                if (first < j) {
                    inputStream.close();
                    inputStream = resource.getInputStream();
                    j = 0;
                }
                if (j < first) {
                    inputStream.skip(first - j);
                } else {
                    first = j;
                }
                C22074IO.copy(inputStream, multiPartOutputStream2, size2);
                j = first + size2;
                multiPartOutputStream = multiPartOutputStream2;
            } else {
                multiPartOutputStream = multiPartOutputStream2;
                resource.writeTo(multiPartOutputStream, first, size2);
            }
            i3++;
            multiPartOutputStream2 = multiPartOutputStream;
        }
        MultiPartOutputStream multiPartOutputStream3 = multiPartOutputStream2;
        if (inputStream != null) {
            inputStream.close();
        }
        multiPartOutputStream3.close();
    }

    public void sendDirectory(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Resource resource, String str) throws IOException {
        if (!this._dirAllowed) {
            httpServletResponse.sendError(403);
            return;
        }
        String strAddPaths = URIUtil.addPaths(httpServletRequest.getRequestURI(), "/");
        Resource resource2 = this._resourceBase;
        if (resource2 != null) {
            if (resource2 instanceof ResourceCollection) {
                resource = resource2.addPath(str);
            }
        } else if (this._contextHandler.getBaseResource() instanceof ResourceCollection) {
            resource = this._contextHandler.getBaseResource().addPath(str);
        }
        String listHTML = resource.getListHTML(strAddPaths, str.length() > 1);
        if (listHTML == null) {
            httpServletResponse.sendError(403, "No directory");
            return;
        }
        byte[] bytes = listHTML.getBytes("UTF-8");
        httpServletResponse.setContentType("text/html; charset=UTF-8");
        httpServletResponse.setContentLength(bytes.length);
        httpServletResponse.getOutputStream().write(bytes);
    }

    public void writeHeaders(HttpServletResponse httpServletResponse, HttpContent httpContent, long j) throws IOException {
        if (httpContent.getContentType() != null && httpServletResponse.getContentType() == null) {
            httpServletResponse.setContentType(httpContent.getContentType().toString());
        }
        if (!(httpServletResponse instanceof Response)) {
            long jLastModified = httpContent.getResource().lastModified();
            if (jLastModified >= 0) {
                httpServletResponse.setDateHeader("Last-Modified", jLastModified);
            }
            if (j != -1) {
                if (j < 2147483647L) {
                    httpServletResponse.setContentLength((int) j);
                } else {
                    httpServletResponse.setHeader("Content-Length", Long.toString(j));
                }
            }
            writeOptionHeaders(httpServletResponse);
            return;
        }
        Response response = (Response) httpServletResponse;
        HttpFields httpFields = response.getHttpFields();
        if (httpContent.getLastModified() != null) {
            httpFields.put(HttpHeaders.LAST_MODIFIED_BUFFER, httpContent.getLastModified());
        } else if (httpContent.getResource() != null) {
            long jLastModified2 = httpContent.getResource().lastModified();
            if (jLastModified2 != -1) {
                httpFields.putDateField(HttpHeaders.LAST_MODIFIED_BUFFER, jLastModified2);
            }
        }
        if (j != -1) {
            response.setLongContentLength(j);
        }
        writeOptionHeaders(httpFields);
    }

    public void writeOptionHeaders(HttpServletResponse httpServletResponse) throws IOException {
        if (this._acceptRanges) {
            httpServletResponse.setHeader(HttpHeaders.ACCEPT_RANGES, HttpHeaderValues.BYTES);
        }
        ByteArrayBuffer byteArrayBuffer = this._cacheControl;
        if (byteArrayBuffer != null) {
            httpServletResponse.setHeader("Cache-Control", byteArrayBuffer.toString());
        }
    }

    public void writeOptionHeaders(HttpFields httpFields) throws IOException {
        if (this._acceptRanges) {
            httpFields.put(HttpHeaders.ACCEPT_RANGES_BUFFER, HttpHeaderValues.BYTES_BUFFER);
        }
        ByteArrayBuffer byteArrayBuffer = this._cacheControl;
        if (byteArrayBuffer != null) {
            httpFields.put(HttpHeaders.CACHE_CONTROL_BUFFER, byteArrayBuffer);
        }
    }
}
