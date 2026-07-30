package com.p003p1.mobile.longlink.msg.liveroom;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.q;
import java.io.IOException;
import java.io.InputStream;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkBottomMenu {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu$1 */
    public static /* synthetic */ class C03841 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1667xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1667xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface LiveBottomMenuUpdateOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface LivePictureTextAlertOrBuilder extends o6z {
        LivePictureTextAlert.ActionType getAction();

        int getActionValue();

        String getButtonText();

        ByteString getButtonTextBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getPictureUrl();

        ByteString getPictureUrlBytes();

        String getText();

        ByteString getTextBytes();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkBottomMenu() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class LivePictureTextAlert extends GeneratedMessageLite<LivePictureTextAlert, Builder> implements LivePictureTextAlertOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int BUTTONTEXT_FIELD_NUMBER = 3;
        private static final LivePictureTextAlert DEFAULT_INSTANCE;
        private static volatile i860<LivePictureTextAlert> PARSER = null;
        public static final int PICTUREURL_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int action_;
        private String pictureUrl_ = "";
        private String text_ = "";
        private String buttonText_ = "";

        public static final class Builder extends GeneratedMessageLite.b<LivePictureTextAlert, Builder> implements LivePictureTextAlertOrBuilder {
            private Builder() {
                super(LivePictureTextAlert.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).clearAction();
                return this;
            }

            public Builder clearButtonText() {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).clearButtonText();
                return this;
            }

            public Builder clearPictureUrl() {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).clearPictureUrl();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).clearText();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public ActionType getAction() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getAction();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public int getActionValue() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getActionValue();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public String getButtonText() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getButtonText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public ByteString getButtonTextBytes() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getButtonTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public String getPictureUrl() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getPictureUrl();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public ByteString getPictureUrlBytes() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getPictureUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public String getText() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
            public ByteString getTextBytes() {
                return ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).getTextBytes();
            }

            public Builder setAction(ActionType actionType) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setAction(actionType);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setActionValue(i);
                return this;
            }

            public Builder setButtonText(String str) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setButtonText(str);
                return this;
            }

            public Builder setButtonTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setButtonTextBytes(byteString);
                return this;
            }

            public Builder setPictureUrl(String str) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setPictureUrl(str);
                return this;
            }

            public Builder setPictureUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setPictureUrlBytes(byteString);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((LivePictureTextAlert) ((GeneratedMessageLite.b) this).instance).setTextBytes(byteString);
                return this;
            }
        }

        static {
            LivePictureTextAlert livePictureTextAlert = new LivePictureTextAlert();
            DEFAULT_INSTANCE = livePictureTextAlert;
            livePictureTextAlert.makeImmutable();
        }

        private LivePictureTextAlert() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtonText() {
            this.buttonText_ = getDefaultInstance().getButtonText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPictureUrl() {
            this.pictureUrl_ = getDefaultInstance().getPictureUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static LivePictureTextAlert getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LivePictureTextAlert livePictureTextAlert) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(livePictureTextAlert);
        }

        public static LivePictureTextAlert parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePictureTextAlert parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LivePictureTextAlert> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(ActionType actionType) {
            actionType.getClass();
            this.action_ = actionType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionValue(int i) {
            this.action_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonText(String str) {
            str.getClass();
            this.buttonText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonTextBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.buttonText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureUrl(String str) {
            str.getClass();
            this.pictureUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPictureUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.pictureUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C03841.f1667xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LivePictureTextAlert();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    LivePictureTextAlert livePictureTextAlert = (LivePictureTextAlert) obj2;
                    this.pictureUrl_ = hVar.f(!this.pictureUrl_.isEmpty(), this.pictureUrl_, !livePictureTextAlert.pictureUrl_.isEmpty(), livePictureTextAlert.pictureUrl_);
                    this.text_ = hVar.f(!this.text_.isEmpty(), this.text_, !livePictureTextAlert.text_.isEmpty(), livePictureTextAlert.text_);
                    this.buttonText_ = hVar.f(!this.buttonText_.isEmpty(), this.buttonText_, !livePictureTextAlert.buttonText_.isEmpty(), livePictureTextAlert.buttonText_);
                    int i = this.action_;
                    boolean z2 = i != 0;
                    int i2 = livePictureTextAlert.action_;
                    this.action_ = hVar.e(z2, i, i2 != 0, i2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.pictureUrl_ = eVar.L();
                                } else if (iM == 18) {
                                    this.text_ = eVar.L();
                                } else if (iM == 26) {
                                    this.buttonText_ = eVar.L();
                                } else if (iM == 32) {
                                    this.action_ = eVar.p();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LivePictureTextAlert.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public ActionType getAction() {
            ActionType actionTypeForNumber = ActionType.forNumber(this.action_);
            return actionTypeForNumber == null ? ActionType.UNRECOGNIZED : actionTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public String getButtonText() {
            return this.buttonText_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public ByteString getButtonTextBytes() {
            return ByteString.copyFromUtf8(this.buttonText_);
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public String getPictureUrl() {
            return this.pictureUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public ByteString getPictureUrlBytes() {
            return ByteString.copyFromUtf8(this.pictureUrl_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.pictureUrl_.isEmpty() ? CodedOutputStream.K(1, getPictureUrl()) : 0;
            if (!this.text_.isEmpty()) {
                iK += CodedOutputStream.K(2, getText());
            }
            if (!this.buttonText_.isEmpty()) {
                iK += CodedOutputStream.K(3, getButtonText());
            }
            if (this.action_ != ActionType.normal.getNumber()) {
                iK += CodedOutputStream.m(4, this.action_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlertOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.pictureUrl_.isEmpty()) {
                codedOutputStream.D0(1, getPictureUrl());
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.D0(2, getText());
            }
            if (!this.buttonText_.isEmpty()) {
                codedOutputStream.D0(3, getButtonText());
            }
            if (this.action_ != ActionType.normal.getNumber()) {
                codedOutputStream.i0(4, this.action_);
            }
        }

        public enum ActionType implements l.c {
            normal(0),
            anchorKickOut(1),
            UNRECOGNIZED(-1);

            public static final int anchorKickOut_VALUE = 1;
            private static final l.d<ActionType> internalValueMap = new l.d<ActionType>() { // from class: com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu.LivePictureTextAlert.ActionType.1
                public ActionType findValueByNumber(int i) {
                    return ActionType.forNumber(i);
                }
            };
            public static final int normal_VALUE = 0;
            private final int value;

            ActionType(int i) {
                this.value = i;
            }

            public static ActionType forNumber(int i) {
                if (i == 0) {
                    return normal;
                }
                if (i != 1) {
                    return null;
                }
                return anchorKickOut;
            }

            public static l.d<ActionType> internalGetValueMap() {
                return internalValueMap;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static LivePictureTextAlert parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LivePictureTextAlert parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LivePictureTextAlert parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LivePictureTextAlert parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LivePictureTextAlert parseFrom(InputStream inputStream) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LivePictureTextAlert parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LivePictureTextAlert parseFrom(e eVar) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LivePictureTextAlert parseFrom(e eVar, h hVar) throws IOException {
            return (LivePictureTextAlert) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class LiveBottomMenuUpdate extends GeneratedMessageLite<LiveBottomMenuUpdate, Builder> implements LiveBottomMenuUpdateOrBuilder {
        private static final LiveBottomMenuUpdate DEFAULT_INSTANCE;
        private static volatile i860<LiveBottomMenuUpdate> PARSER;

        public static final class Builder extends GeneratedMessageLite.b<LiveBottomMenuUpdate, Builder> implements LiveBottomMenuUpdateOrBuilder {
            private Builder() {
                super(LiveBottomMenuUpdate.DEFAULT_INSTANCE);
            }
        }

        static {
            LiveBottomMenuUpdate liveBottomMenuUpdate = new LiveBottomMenuUpdate();
            DEFAULT_INSTANCE = liveBottomMenuUpdate;
            liveBottomMenuUpdate.makeImmutable();
        }

        private LiveBottomMenuUpdate() {
        }

        public static LiveBottomMenuUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LiveBottomMenuUpdate liveBottomMenuUpdate) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(liveBottomMenuUpdate);
        }

        public static LiveBottomMenuUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomMenuUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<LiveBottomMenuUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C03841.f1667xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LiveBottomMenuUpdate();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM == 0 || !eVar.R(iM)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LiveBottomMenuUpdate.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static LiveBottomMenuUpdate parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomMenuUpdate parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static LiveBottomMenuUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LiveBottomMenuUpdate parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static LiveBottomMenuUpdate parseFrom(InputStream inputStream) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LiveBottomMenuUpdate parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static LiveBottomMenuUpdate parseFrom(e eVar) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveBottomMenuUpdate parseFrom(e eVar, h hVar) throws IOException {
            return (LiveBottomMenuUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
