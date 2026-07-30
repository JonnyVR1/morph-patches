package org.spongycastle.crypto.tls;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Integers;
import p149l.csi0;

/* JADX INFO: loaded from: classes3.dex */
class DTLSReliableHandshake {
    private static final int MAX_RECEIVE_AHEAD = 10;
    private TlsHandshakeHash handshakeHash;
    private final DTLSRecordLayer recordLayer;
    private Hashtable currentInboundFlight = new Hashtable();
    private Hashtable previousInboundFlight = null;
    private Vector outboundFlight = new Vector();
    private boolean sending = true;
    private int message_seq = 0;
    private int next_receive_seq = 0;

    public static class Message {
        private final byte[] body;
        private final int message_seq;
        private final short msg_type;

        private Message(int i, short s, byte[] bArr) {
            this.message_seq = i;
            this.msg_type = s;
            this.body = bArr;
        }

        public byte[] getBody() {
            return this.body;
        }

        public int getSeq() {
            return this.message_seq;
        }

        public short getType() {
            return this.msg_type;
        }
    }

    public static class RecordLayerBuffer extends ByteArrayOutputStream {
        public RecordLayerBuffer(int i) {
            super(i);
        }

        public void sendToRecordLayer(DTLSRecordLayer dTLSRecordLayer) throws IOException {
            dTLSRecordLayer.send(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public DTLSReliableHandshake(TlsContext tlsContext, DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
        DeferredHash deferredHash = new DeferredHash();
        this.handshakeHash = deferredHash;
        deferredHash.init(tlsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkAll(Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        while (enumerationElements.hasMoreElements()) {
            if (((DTLSReassembler) enumerationElements.nextElement()).getBodyIfComplete() == null) {
                return false;
            }
        }
        return true;
    }

    private void checkInboundFlight() {
        Enumeration enumerationKeys = this.currentInboundFlight.keys();
        while (enumerationKeys.hasMoreElements()) {
            ((Integer) enumerationKeys.nextElement()).getClass();
        }
    }

    private void prepareInboundFlight() {
        resetAll(this.currentInboundFlight);
        this.previousInboundFlight = this.currentInboundFlight;
        this.currentInboundFlight = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resendOutboundFlight() throws IOException {
        this.recordLayer.resetWriteEpoch();
        for (int i = 0; i < this.outboundFlight.size(); i++) {
            writeMessage((Message) this.outboundFlight.elementAt(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resetAll(Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        while (enumerationElements.hasMoreElements()) {
            ((DTLSReassembler) enumerationElements.nextElement()).reset();
        }
    }

    private Message updateHandshakeMessagesDigest(Message message) throws IOException {
        if (message.getType() != 0) {
            byte[] body = message.getBody();
            byte[] bArr = new byte[12];
            TlsUtils.writeUint8(message.getType(), bArr, 0);
            TlsUtils.writeUint24(body.length, bArr, 1);
            TlsUtils.writeUint16(message.getSeq(), bArr, 4);
            TlsUtils.writeUint24(0, bArr, 6);
            TlsUtils.writeUint24(body.length, bArr, 9);
            this.handshakeHash.update(bArr, 0, 12);
            this.handshakeHash.update(body, 0, body.length);
        }
        return message;
    }

    private void writeHandshakeFragment(Message message, int i, int i2) throws IOException {
        RecordLayerBuffer recordLayerBuffer = new RecordLayerBuffer(i2 + 12);
        TlsUtils.writeUint8(message.getType(), (OutputStream) recordLayerBuffer);
        TlsUtils.writeUint24(message.getBody().length, recordLayerBuffer);
        TlsUtils.writeUint16(message.getSeq(), recordLayerBuffer);
        TlsUtils.writeUint24(i, recordLayerBuffer);
        TlsUtils.writeUint24(i2, recordLayerBuffer);
        recordLayerBuffer.write(message.getBody(), i, i2);
        recordLayerBuffer.sendToRecordLayer(this.recordLayer);
    }

    private void writeMessage(Message message) throws IOException {
        int sendLimit = this.recordLayer.getSendLimit() - 12;
        if (sendLimit < 1) {
            csi0.m108512a(80);
            return;
        }
        int length = message.getBody().length;
        int i = 0;
        do {
            int iMin = Math.min(length - i, sendLimit);
            writeHandshakeFragment(message, i, iMin);
            i += iMin;
        } while (i < length);
    }

    public void finish() {
        if (this.sending) {
            DTLSHandshakeRetransmit dTLSHandshakeRetransmit = this.currentInboundFlight != null ? new DTLSHandshakeRetransmit() { // from class: org.spongycastle.crypto.tls.DTLSReliableHandshake.1
                @Override // org.spongycastle.crypto.tls.DTLSHandshakeRetransmit
                public void receivedHandshakeRecord(int i, byte[] bArr, int i2, int i3) throws IOException {
                    int uint16;
                    DTLSReassembler dTLSReassembler;
                    if (i3 < 12) {
                        return;
                    }
                    int uint24 = TlsUtils.readUint24(bArr, i2 + 9);
                    if (i3 == uint24 + 12 && (uint16 = TlsUtils.readUint16(bArr, i2 + 4)) < DTLSReliableHandshake.this.next_receive_seq) {
                        short uint8 = TlsUtils.readUint8(bArr, i2);
                        if (i != (uint8 == 20 ? 1 : 0)) {
                            return;
                        }
                        int uint25 = TlsUtils.readUint24(bArr, i2 + 1);
                        int uint26 = TlsUtils.readUint24(bArr, i2 + 6);
                        if (uint26 + uint24 <= uint25 && (dTLSReassembler = (DTLSReassembler) DTLSReliableHandshake.this.currentInboundFlight.get(Integers.valueOf(uint16))) != null) {
                            dTLSReassembler.contributeFragment(uint8, uint25, bArr, i2 + 12, uint26, uint24);
                            if (DTLSReliableHandshake.checkAll(DTLSReliableHandshake.this.currentInboundFlight)) {
                                DTLSReliableHandshake.this.resendOutboundFlight();
                                DTLSReliableHandshake.resetAll(DTLSReliableHandshake.this.currentInboundFlight);
                            }
                        }
                    }
                }
            } : null;
            this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
        }
        checkInboundFlight();
        this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
    }

    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    public Message receiveMessage() throws IOException {
        int uint16;
        DTLSReassembler dTLSReassembler;
        byte[] bodyIfComplete;
        byte[] bodyIfComplete2;
        if (this.sending) {
            this.sending = false;
            prepareInboundFlight();
        }
        DTLSReassembler dTLSReassembler2 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(this.next_receive_seq));
        if (dTLSReassembler2 != null && (bodyIfComplete2 = dTLSReassembler2.getBodyIfComplete()) != null) {
            this.previousInboundFlight = null;
            int i = this.next_receive_seq;
            this.next_receive_seq = i + 1;
            return updateHandshakeMessagesDigest(new Message(i, dTLSReassembler2.getMsgType(), bodyIfComplete2));
        }
        int iMin = 1000;
        byte[] bArr = null;
        while (true) {
            int receiveLimit = this.recordLayer.getReceiveLimit();
            if (bArr == null || bArr.length < receiveLimit) {
                bArr = new byte[receiveLimit];
            }
            byte[] bArr2 = bArr;
            while (true) {
                try {
                    int iReceive = this.recordLayer.receive(bArr2, 0, receiveLimit, iMin);
                    if (iReceive < 0) {
                        break;
                    }
                    if (iReceive >= 12) {
                        int uint24 = TlsUtils.readUint24(bArr2, 9);
                        if (iReceive == uint24 + 12 && (uint16 = TlsUtils.readUint16(bArr2, 4)) <= this.next_receive_seq + 10) {
                            short uint8 = TlsUtils.readUint8(bArr2, 0);
                            int uint25 = TlsUtils.readUint24(bArr2, 1);
                            int uint26 = TlsUtils.readUint24(bArr2, 6);
                            if (uint26 + uint24 <= uint25) {
                                if (uint16 < this.next_receive_seq) {
                                    Hashtable hashtable = this.previousInboundFlight;
                                    if (hashtable != null && (dTLSReassembler = (DTLSReassembler) hashtable.get(Integers.valueOf(uint16))) != null) {
                                        dTLSReassembler.contributeFragment(uint8, uint25, bArr2, 12, uint26, uint24);
                                        if (checkAll(this.previousInboundFlight)) {
                                            this.resendOutboundFlight();
                                            iMin = Math.min(iMin * 2, HuiYanResultSender.TIMEOUT_MS);
                                            resetAll(this.previousInboundFlight);
                                        }
                                    }
                                } else {
                                    DTLSReassembler dTLSReassembler3 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(uint16));
                                    if (dTLSReassembler3 == null) {
                                        dTLSReassembler3 = new DTLSReassembler(uint8, uint25);
                                        this.currentInboundFlight.put(Integers.valueOf(uint16), dTLSReassembler3);
                                    }
                                    dTLSReassembler3.contributeFragment(uint8, uint25, bArr2, 12, uint26, uint24);
                                    if (uint16 == this.next_receive_seq && (bodyIfComplete = dTLSReassembler3.getBodyIfComplete()) != null) {
                                        this.previousInboundFlight = null;
                                        int i2 = this.next_receive_seq;
                                        this.next_receive_seq = i2 + 1;
                                        return this.updateHandshakeMessagesDigest(new Message(i2, dTLSReassembler3.getMsgType(), bodyIfComplete));
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            this.resendOutboundFlight();
            iMin = Math.min(iMin * 2, HuiYanResultSender.TIMEOUT_MS);
            bArr = bArr2;
        }
    }

    public byte[] receiveMessageBody(short s) throws IOException {
        Message messageReceiveMessage = receiveMessage();
        if (messageReceiveMessage.getType() == s) {
            return messageReceiveMessage.getBody();
        }
        csi0.m108512a(10);
        return null;
    }

    public void resetHandshakeMessagesDigest() {
        this.handshakeHash.reset();
    }

    public void sendMessage(short s, byte[] bArr) throws IOException {
        TlsUtils.checkUint24(bArr.length);
        if (!this.sending) {
            checkInboundFlight();
            this.sending = true;
            this.outboundFlight.removeAllElements();
        }
        int i = this.message_seq;
        this.message_seq = i + 1;
        Message message = new Message(i, s, bArr);
        this.outboundFlight.addElement(message);
        writeMessage(message);
        updateHandshakeMessagesDigest(message);
    }
}
