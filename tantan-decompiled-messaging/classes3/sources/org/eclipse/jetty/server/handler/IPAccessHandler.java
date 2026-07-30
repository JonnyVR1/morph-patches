package org.eclipse.jetty.server.handler;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.p004io.EndPoint;
import org.eclipse.jetty.server.AbstractHttpConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.util.IPAddressMap;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IPAccessHandler extends HandlerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) IPAccessHandler.class);
    IPAddressMap<PathMap> _white = new IPAddressMap<>();
    IPAddressMap<PathMap> _black = new IPAddressMap<>();

    public IPAccessHandler(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr.length > 0) {
            setWhite(strArr);
        }
        if (strArr2 == null || strArr2.length <= 0) {
            return;
        }
        setBlack(strArr2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x006c, please report this as an issue */
    public void add(String str, IPAddressMap<PathMap> iPAddressMap) {
        int iIndexOf;
        boolean z;
        String strSubstring;
        String strSubstring2;
        PathMap pathMap;
        if (str == null || str.length() <= 0) {
            return;
        }
        if (str.indexOf(EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE) <= 0) {
            iIndexOf = str.indexOf(47);
            if (iIndexOf >= 0) {
                z = true;
            }
            if (iIndexOf > 0) {
                strSubstring = str.substring(0, iIndexOf);
            } else {
                strSubstring = str;
            }
            if (iIndexOf > 0) {
                strSubstring2 = str.substring(iIndexOf);
            } else {
                strSubstring2 = "/*";
            }
            if (strSubstring.endsWith(".")) {
                z = true;
            }
            if (strSubstring2.startsWith("|") || strSubstring2.startsWith("/*.")) {
                strSubstring2 = strSubstring2.substring(1);
            }
            pathMap = iPAddressMap.get(strSubstring);
            if (pathMap == null) {
                pathMap = new PathMap(true);
                iPAddressMap.put(strSubstring, pathMap);
            }
            if (!"".equals(strSubstring2)) {
                pathMap.put(strSubstring2, strSubstring2);
            }
            if (z) {
                LOG.debug(toString() + " - deprecated specification syntax: " + str, new Object[0]);
            }
        }
        iIndexOf = str.indexOf(EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE);
        z = false;
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = str;
        }
        if (iIndexOf > 0) {
            strSubstring2 = str.substring(iIndexOf);
        } else {
            strSubstring2 = "/*";
        }
        if (strSubstring.endsWith(".")) {
            z = true;
        }
        if (strSubstring2.startsWith("|")) {
            strSubstring2 = strSubstring2.substring(1);
        } else {
            strSubstring2 = strSubstring2.substring(1);
        }
        pathMap = iPAddressMap.get(strSubstring);
        if (pathMap == null) {
            pathMap = new PathMap(true);
            iPAddressMap.put(strSubstring, pathMap);
        }
        if (!"".equals(strSubstring2)) {
            pathMap.put(strSubstring2, strSubstring2);
        }
        if (z) {
            LOG.debug(toString() + " - deprecated specification syntax: " + str, new Object[0]);
        }
    }

    public void addBlack(String str) {
        add(str, this._black);
    }

    public void addWhite(String str) {
        add(str, this._white);
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        if (LOG.isDebugEnabled()) {
            System.err.println(dump());
        }
    }

    public void dump(StringBuilder sb, IPAddressMap<PathMap> iPAddressMap) {
        for (String str : iPAddressMap.keySet()) {
            for (Object obj : iPAddressMap.get(str).values()) {
                sb.append("# ");
                sb.append(str);
                sb.append("|");
                sb.append(obj);
                sb.append("\n");
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        EndPoint endPoint;
        String remoteAddr;
        AbstractHttpConnection connection = request.getConnection();
        if (connection == null || (endPoint = connection.getEndPoint()) == null || (remoteAddr = endPoint.getRemoteAddr()) == null || isAddrUriAllowed(remoteAddr, request.getPathInfo())) {
            getHandler().handle(str, request, httpServletRequest, httpServletResponse);
        } else {
            httpServletResponse.sendError(HttpStatus.FORBIDDEN_403);
            request.setHandled(true);
        }
    }

    public boolean isAddrUriAllowed(String str, String str2) {
        Object lazyMatches;
        boolean z;
        if (this._white.size() > 0) {
            Object lazyMatches2 = this._white.getLazyMatches(str);
            if (lazyMatches2 != null) {
                Iterator it = (lazyMatches2 instanceof List ? (List) lazyMatches2 : Collections.singletonList(lazyMatches2)).iterator();
                z = false;
                while (it.hasNext()) {
                    PathMap pathMap = (PathMap) ((Map.Entry) it.next()).getValue();
                    z = pathMap != null && (pathMap.size() == 0 || pathMap.match(str2) != null);
                    if (z) {
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        if (this._black.size() > 0 && (lazyMatches = this._black.getLazyMatches(str)) != null) {
            Iterator it2 = (lazyMatches instanceof List ? (List) lazyMatches : Collections.singletonList(lazyMatches)).iterator();
            while (it2.hasNext()) {
                PathMap pathMap2 = (PathMap) ((Map.Entry) it2.next()).getValue();
                if (pathMap2 != null && (pathMap2.size() == 0 || pathMap2.match(str2) != null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void set(String[] strArr, IPAddressMap<PathMap> iPAddressMap) {
        iPAddressMap.clear();
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            add(str, iPAddressMap);
        }
    }

    public void setBlack(String[] strArr) {
        set(strArr, this._black);
    }

    public void setWhite(String[] strArr) {
        set(strArr, this._white);
    }

    public IPAccessHandler() {
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append(" WHITELIST:\n");
        dump(sb, this._white);
        sb.append(toString());
        sb.append(" BLACKLIST:\n");
        dump(sb, this._black);
        return sb.toString();
    }
}
