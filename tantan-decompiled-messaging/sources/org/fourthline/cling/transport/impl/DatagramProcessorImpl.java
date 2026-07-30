package org.fourthline.cling.transport.impl;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.CharEncoding;
import org.eclipse.jetty.http.HttpVersions;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.OutgoingDatagramMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.spi.DatagramProcessor;
import org.seamless.http.Headers;
import p149l.b7c;

/* JADX INFO: loaded from: classes3.dex */
public class DatagramProcessorImpl implements DatagramProcessor {
    private static Logger log = Logger.getLogger(DatagramProcessor.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // org.fourthline.cling.transport.spi.DatagramProcessor
    public IncomingDatagramMessage read(InetAddress inetAddress, DatagramPacket datagramPacket) throws UnsupportedDataException {
        ?? StartsWith;
        Exception exc;
        DatagramPacket datagramPacket2;
        try {
            if (log.isLoggable(Level.FINER)) {
                try {
                    log.finer("===================================== DATAGRAM BEGIN ============================================");
                    log.finer(new String(datagramPacket.getData(), "UTF-8"));
                    log.finer("-===================================== DATAGRAM END =============================================");
                } catch (Exception e) {
                    exc = e;
                    datagramPacket2 = datagramPacket;
                }
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datagramPacket.getData());
            String[] strArrSplit = Headers.readLine(byteArrayInputStream).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            StartsWith = strArrSplit[0].startsWith("HTTP/1.");
            try {
                return StartsWith != 0 ? readResponseMessage(inetAddress, datagramPacket, byteArrayInputStream, Integer.valueOf(strArrSplit[1]).intValue(), strArrSplit[2], strArrSplit[0]) : readRequestMessage(inetAddress, datagramPacket, byteArrayInputStream, strArrSplit[0], strArrSplit[2]);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            StartsWith = datagramPacket;
        }
        exc = e;
        datagramPacket2 = StartsWith;
        throw new UnsupportedDataException("Could not parse headers: " + exc, exc, datagramPacket2.getData());
    }

    public IncomingDatagramMessage readRequestMessage(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, String str, String str2) throws Exception {
        UpnpHeaders upnpHeaders = new UpnpHeaders(byteArrayInputStream);
        UpnpRequest upnpRequest = new UpnpRequest(UpnpRequest.Method.getByHttpName(str));
        upnpRequest.setHttpMinorVersion(str2.toUpperCase(Locale.ROOT).equals(HttpVersions.HTTP_1_1) ? 1 : 0);
        IncomingDatagramMessage incomingDatagramMessage = new IncomingDatagramMessage(upnpRequest, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        incomingDatagramMessage.setHeaders(upnpHeaders);
        return incomingDatagramMessage;
    }

    public IncomingDatagramMessage readResponseMessage(InetAddress inetAddress, DatagramPacket datagramPacket, ByteArrayInputStream byteArrayInputStream, int i, String str, String str2) throws Exception {
        UpnpHeaders upnpHeaders = new UpnpHeaders(byteArrayInputStream);
        UpnpResponse upnpResponse = new UpnpResponse(i, str);
        upnpResponse.setHttpMinorVersion(str2.toUpperCase(Locale.ROOT).equals(HttpVersions.HTTP_1_1) ? 1 : 0);
        IncomingDatagramMessage incomingDatagramMessage = new IncomingDatagramMessage(upnpResponse, datagramPacket.getAddress(), datagramPacket.getPort(), inetAddress);
        incomingDatagramMessage.setHeaders(upnpHeaders);
        return incomingDatagramMessage;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [org.fourthline.cling.model.message.UpnpOperation] */
    @Override // org.fourthline.cling.transport.spi.DatagramProcessor
    public DatagramPacket write(OutgoingDatagramMessage outgoingDatagramMessage) throws UnsupportedDataException {
        StringBuilder sb = new StringBuilder();
        ?? operation = outgoingDatagramMessage.getOperation();
        if (operation instanceof UpnpRequest) {
            sb.append(((UpnpRequest) operation).getHttpMethodName());
            sb.append(" * HTTP/1.");
            sb.append(operation.getHttpMinorVersion());
            sb.append("\r\n");
        } else {
            if (!(operation instanceof UpnpResponse)) {
                b7c.m100623a("Message operation is not request or response, don't know how to process: ", outgoingDatagramMessage);
                return null;
            }
            UpnpResponse upnpResponse = (UpnpResponse) operation;
            sb.append("HTTP/1.");
            sb.append(operation.getHttpMinorVersion());
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(upnpResponse.getStatusCode());
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(upnpResponse.getStatusMessage());
            sb.append("\r\n");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb);
        sb2.append(outgoingDatagramMessage.getHeaders().toString());
        sb2.append("\r\n");
        if (log.isLoggable(Level.FINER)) {
            log.finer("Writing message data for: " + outgoingDatagramMessage);
            log.finer("---------------------------------------------------------------------------------");
            log.finer(sb2.toString().substring(0, sb2.length() + (-2)));
            log.finer("---------------------------------------------------------------------------------");
        }
        try {
            byte[] bytes = sb2.toString().getBytes(CharEncoding.US_ASCII);
            log.fine("Writing new datagram packet with " + bytes.length + " bytes for: " + outgoingDatagramMessage);
            return new DatagramPacket(bytes, bytes.length, outgoingDatagramMessage.getDestinationAddress(), outgoingDatagramMessage.getDestinationPort());
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedDataException("Can't convert message content to US-ASCII: " + e.getMessage(), e, sb2);
        }
    }
}
