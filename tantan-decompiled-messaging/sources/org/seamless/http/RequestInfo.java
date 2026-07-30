package org.seamless.http;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Enumeration;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public class RequestInfo {
    private static final Logger log = Logger.getLogger(RequestInfo.class.getName());

    public static void dumpRequestHeaders(long j, String str, HttpServletRequest httpServletRequest) {
        log.info(str);
        dumpRequestString(j, httpServletRequest);
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String strNextElement = headerNames.nextElement();
                log.info(String.format("%s: %s", strNextElement, httpServletRequest.getHeader(strNextElement)));
            }
        }
        log.info("----------------------------------------");
    }

    public static void dumpRequestString(long j, HttpServletRequest httpServletRequest) {
        log.info(getRequestInfoString(j, httpServletRequest));
    }

    public static String getRequestFullURL(HttpServletRequest httpServletRequest) {
        String scheme = httpServletRequest.getScheme();
        String serverName = httpServletRequest.getServerName();
        int serverPort = httpServletRequest.getServerPort();
        String contextPath = httpServletRequest.getContextPath();
        String servletPath = httpServletRequest.getServletPath();
        String pathInfo = httpServletRequest.getPathInfo();
        String queryString = httpServletRequest.getQueryString();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(scheme);
        stringBuffer.append("://");
        stringBuffer.append(serverName);
        if (serverPort != 80 && serverPort != 443) {
            stringBuffer.append(":");
            stringBuffer.append(serverPort);
        }
        stringBuffer.append(contextPath);
        stringBuffer.append(servletPath);
        if (pathInfo != null) {
            stringBuffer.append(pathInfo);
        }
        if (queryString != null) {
            stringBuffer.append("?");
            stringBuffer.append(queryString);
        }
        return stringBuffer.toString();
    }

    public static String getRequestInfoString(long j, HttpServletRequest httpServletRequest) {
        return String.format("%s %s %s %s %s %d", httpServletRequest.getMethod(), httpServletRequest.getRequestURI(), httpServletRequest.getProtocol(), httpServletRequest.getParameterMap(), httpServletRequest.getRemoteAddr(), Long.valueOf(j));
    }

    public static boolean isAndroidBubbleUPnPRequest(String str) {
        return str != null && str.contains("BubbleUPnP");
    }

    public static boolean isJRiverRequest(String str) {
        if (str != null) {
            return str.contains("J-River") || str.contains("J. River");
        }
        return false;
    }

    public static boolean isPS3Request(String str, String str2) {
        if (str == null || !str.contains("PLAYSTATION 3")) {
            return str2 != null && str2.contains("PLAYSTATION 3");
        }
        return true;
    }

    public static boolean isWMPRequest(String str) {
        return (str == null || !str.contains("Windows-Media-Player") || isJRiverRequest(str)) ? false : true;
    }

    public static boolean isXbox360AlbumArtRequest(HttpServletRequest httpServletRequest) {
        return "true".equals(httpServletRequest.getParameter("albumArt")) && isXbox360Request(httpServletRequest);
    }

    public static boolean isXbox360Request(String str, String str2) {
        if (str == null || !(str.contains("Xbox") || str.contains("Xenon"))) {
            return str2 != null && str2.contains("Xbox");
        }
        return true;
    }

    public static void reportClient(StringBuilder sb, HttpServletRequest httpServletRequest) {
        sb.append("Remote Address: ");
        sb.append(httpServletRequest.getRemoteAddr());
        sb.append(SignParameters.NEW_LINE);
        if (!httpServletRequest.getRemoteAddr().equals(httpServletRequest.getRemoteHost())) {
            sb.append("Remote Host: ");
            sb.append(httpServletRequest.getRemoteHost());
            sb.append(SignParameters.NEW_LINE);
        }
        sb.append("Remote Port: ");
        sb.append(httpServletRequest.getRemotePort());
        sb.append(SignParameters.NEW_LINE);
        if (httpServletRequest.getRemoteUser() != null) {
            sb.append("Remote User: ");
            sb.append(httpServletRequest.getRemoteUser());
            sb.append(SignParameters.NEW_LINE);
        }
    }

    public static void reportCookies(StringBuilder sb, HttpServletRequest httpServletRequest) {
        Cookie[] cookies = httpServletRequest.getCookies();
        if (cookies != null && (cookies.length) > 0) {
            sb.append("Cookies:\n");
            for (Cookie cookie : cookies) {
                sb.append("    ");
                sb.append(cookie.getName());
                sb.append(" = ");
                sb.append(cookie.getValue());
                sb.append('\n');
            }
        }
    }

    public static void reportHeaders(StringBuilder sb, HttpServletRequest httpServletRequest) {
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        if (headerNames != null && headerNames.hasMoreElements()) {
            sb.append("Headers:\n");
            while (headerNames.hasMoreElements()) {
                String strNextElement = headerNames.nextElement();
                String header = httpServletRequest.getHeader(strNextElement);
                sb.append("    ");
                sb.append(strNextElement);
                sb.append(": ");
                sb.append(header);
                sb.append('\n');
            }
        }
    }

    public static void reportParameters(StringBuilder sb, HttpServletRequest httpServletRequest) {
        Enumeration<String> parameterNames = httpServletRequest.getParameterNames();
        if (parameterNames != null && parameterNames.hasMoreElements()) {
            sb.append("Parameters:\n");
            while (parameterNames.hasMoreElements()) {
                String strNextElement = parameterNames.nextElement();
                String[] parameterValues = httpServletRequest.getParameterValues(strNextElement);
                if (parameterValues != null) {
                    for (String str : parameterValues) {
                        sb.append("    ");
                        sb.append(strNextElement);
                        sb.append(" = ");
                        sb.append(str);
                        sb.append('\n');
                    }
                }
            }
        }
    }

    public static void reportRequest(StringBuilder sb, HttpServletRequest httpServletRequest) {
        sb.append("Request: ");
        sb.append(httpServletRequest.getMethod());
        sb.append(' ');
        sb.append(httpServletRequest.getRequestURL());
        String queryString = httpServletRequest.getQueryString();
        if (queryString != null) {
            sb.append('?');
            sb.append(queryString);
        }
        sb.append(" - ");
        String requestedSessionId = httpServletRequest.getRequestedSessionId();
        if (requestedSessionId != null) {
            sb.append("\nSession ID: ");
        }
        if (requestedSessionId == null) {
            sb.append("No Session");
            return;
        }
        if (!httpServletRequest.isRequestedSessionIdValid()) {
            sb.append("Invalid Session ID\n");
            return;
        }
        sb.append(requestedSessionId);
        sb.append(" (from ");
        if (httpServletRequest.isRequestedSessionIdFromCookie()) {
            sb.append("cookie)\n");
        } else if (httpServletRequest.isRequestedSessionIdFromURL()) {
            sb.append("url)\n");
        } else {
            sb.append("unknown)\n");
        }
    }

    public static boolean isJRiverRequest(HttpServletRequest httpServletRequest) {
        return isJRiverRequest(httpServletRequest.getHeader("User-Agent"));
    }

    public static boolean isPS3Request(HttpServletRequest httpServletRequest) {
        return isPS3Request(httpServletRequest.getHeader("User-Agent"), httpServletRequest.getHeader("X-AV-Client-Info"));
    }

    public static boolean isXbox360Request(HttpServletRequest httpServletRequest) {
        return isXbox360Request(httpServletRequest.getHeader("User-Agent"), httpServletRequest.getHeader(HttpHeaders.SERVER));
    }

    public static void dumpRequestHeaders(long j, HttpServletRequest httpServletRequest) {
        dumpRequestHeaders(j, "REQUEST HEADERS", httpServletRequest);
    }
}
