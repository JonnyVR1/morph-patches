package com.p051p1.mobile.longlink.msg.enterroomeffect;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkEnterRoomMessage {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage$1 */
    public static /* synthetic */ class C45591 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16658xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16658xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16658xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface HierarchyOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        long getGrade();

        String getIcon();

        ByteString getIconBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface HierarchysOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Hierarchy getWealthHierarchy();

        boolean hasWealthHierarchy();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface UserEnterRoomEffectOrBuilder extends lfz {
        long getAnimationSizeType();

        EnterRoomEffectGradientDirection getAvatarGradientDirection();

        int getAvatarGradientDirectionValue();

        String getAvatarGradients(int i);

        ByteString getAvatarGradientsBytes(int i);

        int getAvatarGradientsCount();

        List<String> getAvatarGradientsList();

        EnterRoomEffectGradientDirection getBackgroundGradientDirection();

        int getBackgroundGradientDirectionValue();

        String getBackgroundGradients(int i);

        ByteString getBackgroundGradientsBytes(int i);

        int getBackgroundGradientsCount();

        List<String> getBackgroundGradientsList();

        String getBackgroundUrl();

        ByteString getBackgroundUrlBytes();

        long getBackgroundUrlEndMargin();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        LongLinkGiftMessage.DynamicEffectExtend getDynamicEffectExtends(int i);

        int getDynamicEffectExtendsCount();

        List<LongLinkGiftMessage.DynamicEffectExtend> getDynamicEffectExtendsList();

        String getEffectId();

        ByteString getEffectIdBytes();

        long getEnterVersion();

        long getExpireTime();

        String getFixedBackgroundUrl();

        ByteString getFixedBackgroundUrlBytes();

        String getFloatingUrl();

        ByteString getFloatingUrlBytes();

        Hierarchys getHierarchys();

        String getInternalText();

        ByteString getInternalTextBytes();

        boolean getIsWealthHierarchy();

        String getNewFloatingUrl();

        ByteString getNewFloatingUrlBytes();

        String getNewResourceId();

        ByteString getNewResourceIdBytes();

        PlaceType getPlaceType();

        int getPlaceTypeValue();

        String getResourceId();

        ByteString getResourceIdBytes();

        String getRoomId();

        ByteString getRoomIdBytes();

        long getShowDuration();

        String getText();

        ByteString getTextBytes();

        String getTextColor();

        ByteString getTextColorBytes();

        String getUserId();

        ByteString getUserIdBytes();

        String getUserImage();

        ByteString getUserImageBytes();

        String getUserName();

        ByteString getUserNameBytes();

        String getUserNameColor();

        ByteString getUserNameColorBytes();

        String getUserNameGradientColors(int i);

        ByteString getUserNameGradientColorsBytes(int i);

        int getUserNameGradientColorsCount();

        List<String> getUserNameGradientColorsList();

        VideoEffectExtra getVideoEffectExtras(int i);

        int getVideoEffectExtrasCount();

        List<VideoEffectExtra> getVideoEffectExtrasList();

        boolean hasHierarchys();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface VideoEffectExtraOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        long getType();

        String getValue();

        ByteString getValueBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkEnterRoomMessage() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public enum EnterRoomEffectGradientDirection implements C3437l.c {
        unknow(0),
        fromUpToDown(1),
        fromLeftToRight(2),
        fromLeftUpToRightDown(3),
        UNRECOGNIZED(-1);

        public static final int fromLeftToRight_VALUE = 2;
        public static final int fromLeftUpToRightDown_VALUE = 3;
        public static final int fromUpToDown_VALUE = 1;
        private static final C3437l.d<EnterRoomEffectGradientDirection> internalValueMap = new C3437l.d<EnterRoomEffectGradientDirection>() { // from class: com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.EnterRoomEffectGradientDirection.1
            @Override // com.google.protobuf.C3437l.d
            public EnterRoomEffectGradientDirection findValueByNumber(int i) {
                return EnterRoomEffectGradientDirection.forNumber(i);
            }
        };
        public static final int unknow_VALUE = 0;
        private final int value;

        EnterRoomEffectGradientDirection(int i) {
            this.value = i;
        }

        public static EnterRoomEffectGradientDirection forNumber(int i) {
            if (i == 0) {
                return unknow;
            }
            if (i == 1) {
                return fromUpToDown;
            }
            if (i == 2) {
                return fromLeftToRight;
            }
            if (i != 3) {
                return null;
            }
            return fromLeftUpToRightDown;
        }

        public static C3437l.d<EnterRoomEffectGradientDirection> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EnterRoomEffectGradientDirection valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Hierarchy extends GeneratedMessageLite<Hierarchy, Builder> implements HierarchyOrBuilder {
        private static final Hierarchy DEFAULT_INSTANCE;
        public static final int GRADE_FIELD_NUMBER = 1;
        public static final int ICON_FIELD_NUMBER = 2;
        private static volatile ng60<Hierarchy> PARSER;
        private long grade_;
        private String icon_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Hierarchy, Builder> implements HierarchyOrBuilder {
            private Builder() {
                super(Hierarchy.DEFAULT_INSTANCE);
            }

            public Builder clearGrade() {
                copyOnWrite();
                ((Hierarchy) this.instance).clearGrade();
                return this;
            }

            public Builder clearIcon() {
                copyOnWrite();
                ((Hierarchy) this.instance).clearIcon();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
            public long getGrade() {
                return ((Hierarchy) this.instance).getGrade();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
            public String getIcon() {
                return ((Hierarchy) this.instance).getIcon();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
            public ByteString getIconBytes() {
                return ((Hierarchy) this.instance).getIconBytes();
            }

            public Builder setGrade(long j) {
                copyOnWrite();
                ((Hierarchy) this.instance).setGrade(j);
                return this;
            }

            public Builder setIcon(String str) {
                copyOnWrite();
                ((Hierarchy) this.instance).setIcon(str);
                return this;
            }

            public Builder setIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Hierarchy) this.instance).setIconBytes(byteString);
                return this;
            }
        }

        static {
            Hierarchy hierarchy = new Hierarchy();
            DEFAULT_INSTANCE = hierarchy;
            hierarchy.makeImmutable();
        }

        private Hierarchy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGrade() {
            this.grade_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        public static Hierarchy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Hierarchy hierarchy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hierarchy);
        }

        public static Hierarchy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hierarchy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Hierarchy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGrade(long j) {
            this.grade_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45591.f16658xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Hierarchy();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Hierarchy hierarchy = (Hierarchy) obj2;
                    long j = this.grade_;
                    boolean z2 = j != 0;
                    long j2 = hierarchy.grade_;
                    this.grade_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.icon_ = interfaceC3409h.mo17052f(!this.icon_.isEmpty(), this.icon_, !hierarchy.icon_.isEmpty(), hierarchy.icon_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.grade_ = c3430e.m17197v();
                                } else if (iM17171M == 18) {
                                    this.icon_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Hierarchy.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
        public long getGrade() {
            return this.grade_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
        public String getIcon() {
            return this.icon_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchyOrBuilder
        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.grade_;
            int iM16986v = j != 0 ? CodedOutputStream.m16986v(1, j) : 0;
            if (!this.icon_.isEmpty()) {
                iM16986v += CodedOutputStream.m16956K(2, getIcon());
            }
            this.memoizedSerializedSize = iM16986v;
            return iM16986v;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.grade_;
            if (j != 0) {
                codedOutputStream.m17027u0(1, j);
            }
            if (this.icon_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(2, getIcon());
        }

        public static Hierarchy parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Hierarchy parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Hierarchy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Hierarchy parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Hierarchy parseFrom(InputStream inputStream) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hierarchy parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Hierarchy parseFrom(C3430e c3430e) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Hierarchy parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Hierarchy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Hierarchys extends GeneratedMessageLite<Hierarchys, Builder> implements HierarchysOrBuilder {
        private static final Hierarchys DEFAULT_INSTANCE;
        private static volatile ng60<Hierarchys> PARSER = null;
        public static final int WEALTHHIERARCHY_FIELD_NUMBER = 1;
        private Hierarchy wealthHierarchy_;

        static {
            Hierarchys hierarchys = new Hierarchys();
            DEFAULT_INSTANCE = hierarchys;
            hierarchys.makeImmutable();
        }

        private Hierarchys() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWealthHierarchy() {
            this.wealthHierarchy_ = null;
        }

        public static Hierarchys getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWealthHierarchy(Hierarchy hierarchy) {
            Hierarchy hierarchy2 = this.wealthHierarchy_;
            if (hierarchy2 == null || hierarchy2 == Hierarchy.getDefaultInstance()) {
                this.wealthHierarchy_ = hierarchy;
            } else {
                this.wealthHierarchy_ = Hierarchy.newBuilder(this.wealthHierarchy_).mergeFrom(hierarchy).buildPartial();
            }
        }

        public static Builder newBuilder(Hierarchys hierarchys) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hierarchys);
        }

        public static Hierarchys parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hierarchys parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Hierarchys> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWealthHierarchy(Hierarchy.Builder builder) {
            this.wealthHierarchy_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C45591.f16658xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Hierarchys();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.wealthHierarchy_ = (Hierarchy) ((GeneratedMessageLite.InterfaceC3409h) obj).mo17061o(this.wealthHierarchy_, ((Hierarchys) obj2).wealthHierarchy_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    Hierarchy hierarchy = this.wealthHierarchy_;
                                    Hierarchy.Builder builder = hierarchy != null ? hierarchy.toBuilder() : null;
                                    Hierarchy hierarchy2 = (Hierarchy) c3430e.m17198w(Hierarchy.parser(), c3433h);
                                    this.wealthHierarchy_ = hierarchy2;
                                    if (builder != null) {
                                        builder.mergeFrom(hierarchy2);
                                        this.wealthHierarchy_ = builder.buildPartial();
                                    }
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Hierarchys.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.wealthHierarchy_ != null ? CodedOutputStream.m16948C(1, getWealthHierarchy()) : 0;
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchysOrBuilder
        public Hierarchy getWealthHierarchy() {
            Hierarchy hierarchy = this.wealthHierarchy_;
            return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchysOrBuilder
        public boolean hasWealthHierarchy() {
            return this.wealthHierarchy_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.wealthHierarchy_ != null) {
                codedOutputStream.mo17029w0(1, getWealthHierarchy());
            }
        }

        public static Hierarchys parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Hierarchys parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWealthHierarchy(Hierarchy hierarchy) {
            hierarchy.getClass();
            this.wealthHierarchy_ = hierarchy;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Hierarchys, Builder> implements HierarchysOrBuilder {
            private Builder() {
                super(Hierarchys.DEFAULT_INSTANCE);
            }

            public Builder clearWealthHierarchy() {
                copyOnWrite();
                ((Hierarchys) this.instance).clearWealthHierarchy();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchysOrBuilder
            public Hierarchy getWealthHierarchy() {
                return ((Hierarchys) this.instance).getWealthHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.HierarchysOrBuilder
            public boolean hasWealthHierarchy() {
                return ((Hierarchys) this.instance).hasWealthHierarchy();
            }

            public Builder mergeWealthHierarchy(Hierarchy hierarchy) {
                copyOnWrite();
                ((Hierarchys) this.instance).mergeWealthHierarchy(hierarchy);
                return this;
            }

            public Builder setWealthHierarchy(Hierarchy hierarchy) {
                copyOnWrite();
                ((Hierarchys) this.instance).setWealthHierarchy(hierarchy);
                return this;
            }

            public Builder setWealthHierarchy(Hierarchy.Builder builder) {
                copyOnWrite();
                ((Hierarchys) this.instance).setWealthHierarchy(builder);
                return this;
            }
        }

        public static Hierarchys parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Hierarchys parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Hierarchys parseFrom(InputStream inputStream) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Hierarchys parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Hierarchys parseFrom(C3430e c3430e) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Hierarchys parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Hierarchys) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public enum PlaceType implements C3437l.c {
        videoRoom(0),
        voiceRoom(1),
        UNRECOGNIZED(-1);

        private static final C3437l.d<PlaceType> internalValueMap = new C3437l.d<PlaceType>() { // from class: com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.PlaceType.1
            @Override // com.google.protobuf.C3437l.d
            public PlaceType findValueByNumber(int i) {
                return PlaceType.forNumber(i);
            }
        };
        public static final int videoRoom_VALUE = 0;
        public static final int voiceRoom_VALUE = 1;
        private final int value;

        PlaceType(int i) {
            this.value = i;
        }

        public static PlaceType forNumber(int i) {
            if (i == 0) {
                return videoRoom;
            }
            if (i != 1) {
                return null;
            }
            return voiceRoom;
        }

        public static C3437l.d<PlaceType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.C3437l.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlaceType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class UserEnterRoomEffect extends GeneratedMessageLite<UserEnterRoomEffect, Builder> implements UserEnterRoomEffectOrBuilder {
        public static final int ANIMATIONSIZETYPE_FIELD_NUMBER = 24;
        public static final int AVATARGRADIENTDIRECTION_FIELD_NUMBER = 14;
        public static final int AVATARGRADIENTS_FIELD_NUMBER = 15;
        public static final int BACKGROUNDGRADIENTDIRECTION_FIELD_NUMBER = 16;
        public static final int BACKGROUNDGRADIENTS_FIELD_NUMBER = 17;
        public static final int BACKGROUNDURLENDMARGIN_FIELD_NUMBER = 21;
        public static final int BACKGROUNDURL_FIELD_NUMBER = 9;
        private static final UserEnterRoomEffect DEFAULT_INSTANCE;
        public static final int DYNAMICEFFECTEXTENDS_FIELD_NUMBER = 29;
        public static final int EFFECTID_FIELD_NUMBER = 18;
        public static final int ENTERVERSION_FIELD_NUMBER = 25;
        public static final int EXPIRETIME_FIELD_NUMBER = 20;
        public static final int FIXEDBACKGROUNDURL_FIELD_NUMBER = 23;
        public static final int FLOATINGURL_FIELD_NUMBER = 10;
        public static final int HIERARCHYS_FIELD_NUMBER = 3;
        public static final int INTERNALTEXT_FIELD_NUMBER = 19;
        public static final int ISWEALTHHIERARCHY_FIELD_NUMBER = 13;
        public static final int NEWFLOATINGURL_FIELD_NUMBER = 27;
        public static final int NEWRESOURCEID_FIELD_NUMBER = 28;
        private static volatile ng60<UserEnterRoomEffect> PARSER = null;
        public static final int PLACETYPE_FIELD_NUMBER = 22;
        public static final int RESOURCEID_FIELD_NUMBER = 11;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int SHOWDURATION_FIELD_NUMBER = 12;
        public static final int TEXTCOLOR_FIELD_NUMBER = 8;
        public static final int TEXT_FIELD_NUMBER = 7;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERIMAGE_FIELD_NUMBER = 5;
        public static final int USERNAMECOLOR_FIELD_NUMBER = 6;
        public static final int USERNAMEGRADIENTCOLORS_FIELD_NUMBER = 30;
        public static final int USERNAME_FIELD_NUMBER = 4;
        public static final int VIDEOEFFECTEXTRAS_FIELD_NUMBER = 26;
        private long animationSizeType_;
        private int avatarGradientDirection_;
        private int backgroundGradientDirection_;
        private long backgroundUrlEndMargin_;
        private int bitField0_;
        private long enterVersion_;
        private long expireTime_;
        private Hierarchys hierarchys_;
        private boolean isWealthHierarchy_;
        private int placeType_;
        private long showDuration_;
        private String userId_ = "";
        private String roomId_ = "";
        private String userName_ = "";
        private String userImage_ = "";
        private String userNameColor_ = "";
        private String text_ = "";
        private String textColor_ = "";
        private String backgroundUrl_ = "";
        private String floatingUrl_ = "";
        private String resourceId_ = "";
        private C3437l.h<String> avatarGradients_ = GeneratedMessageLite.emptyProtobufList();
        private C3437l.h<String> backgroundGradients_ = GeneratedMessageLite.emptyProtobufList();
        private String effectId_ = "";
        private String internalText_ = "";
        private String fixedBackgroundUrl_ = "";
        private C3437l.h<VideoEffectExtra> videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        private String newFloatingUrl_ = "";
        private String newResourceId_ = "";
        private C3437l.h<LongLinkGiftMessage.DynamicEffectExtend> dynamicEffectExtends_ = GeneratedMessageLite.emptyProtobufList();
        private C3437l.h<String> userNameGradientColors_ = GeneratedMessageLite.emptyProtobufList();

        static {
            UserEnterRoomEffect userEnterRoomEffect = new UserEnterRoomEffect();
            DEFAULT_INSTANCE = userEnterRoomEffect;
            userEnterRoomEffect.makeImmutable();
        }

        private UserEnterRoomEffect() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAvatarGradients(Iterable<String> iterable) {
            ensureAvatarGradientsIsMutable();
            AbstractC3426a.addAll(iterable, this.avatarGradients_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBackgroundGradients(Iterable<String> iterable) {
            ensureBackgroundGradientsIsMutable();
            AbstractC3426a.addAll(iterable, this.backgroundGradients_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDynamicEffectExtends(Iterable<? extends LongLinkGiftMessage.DynamicEffectExtend> iterable) {
            ensureDynamicEffectExtendsIsMutable();
            AbstractC3426a.addAll(iterable, this.dynamicEffectExtends_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUserNameGradientColors(Iterable<String> iterable) {
            ensureUserNameGradientColorsIsMutable();
            AbstractC3426a.addAll(iterable, this.userNameGradientColors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
            ensureVideoEffectExtrasIsMutable();
            AbstractC3426a.addAll(iterable, this.videoEffectExtras_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvatarGradients(String str) {
            str.getClass();
            ensureAvatarGradientsIsMutable();
            this.avatarGradients_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAvatarGradientsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureAvatarGradientsIsMutable();
            this.avatarGradients_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBackgroundGradients(String str) {
            str.getClass();
            ensureBackgroundGradientsIsMutable();
            this.backgroundGradients_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBackgroundGradientsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureBackgroundGradientsIsMutable();
            this.backgroundGradients_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserNameGradientColors(String str) {
            str.getClass();
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUserNameGradientColorsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationSizeType() {
            this.animationSizeType_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarGradientDirection() {
            this.avatarGradientDirection_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarGradients() {
            this.avatarGradients_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundGradientDirection() {
            this.backgroundGradientDirection_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundGradients() {
            this.backgroundGradients_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrl() {
            this.backgroundUrl_ = getDefaultInstance().getBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundUrlEndMargin() {
            this.backgroundUrlEndMargin_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicEffectExtends() {
            this.dynamicEffectExtends_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEffectId() {
            this.effectId_ = getDefaultInstance().getEffectId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnterVersion() {
            this.enterVersion_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpireTime() {
            this.expireTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedBackgroundUrl() {
            this.fixedBackgroundUrl_ = getDefaultInstance().getFixedBackgroundUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatingUrl() {
            this.floatingUrl_ = getDefaultInstance().getFloatingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHierarchys() {
            this.hierarchys_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInternalText() {
            this.internalText_ = getDefaultInstance().getInternalText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsWealthHierarchy() {
            this.isWealthHierarchy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewFloatingUrl() {
            this.newFloatingUrl_ = getDefaultInstance().getNewFloatingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewResourceId() {
            this.newResourceId_ = getDefaultInstance().getNewResourceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlaceType() {
            this.placeType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResourceId() {
            this.resourceId_ = getDefaultInstance().getResourceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomId() {
            this.roomId_ = getDefaultInstance().getRoomId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowDuration() {
            this.showDuration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserImage() {
            this.userImage_ = getDefaultInstance().getUserImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserName() {
            this.userName_ = getDefaultInstance().getUserName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserNameColor() {
            this.userNameColor_ = getDefaultInstance().getUserNameColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserNameGradientColors() {
            this.userNameGradientColors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoEffectExtras() {
            this.videoEffectExtras_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAvatarGradientsIsMutable() {
            if (this.avatarGradients_.mo17140q()) {
                return;
            }
            this.avatarGradients_ = GeneratedMessageLite.mutableCopy(this.avatarGradients_);
        }

        private void ensureBackgroundGradientsIsMutable() {
            if (this.backgroundGradients_.mo17140q()) {
                return;
            }
            this.backgroundGradients_ = GeneratedMessageLite.mutableCopy(this.backgroundGradients_);
        }

        private void ensureDynamicEffectExtendsIsMutable() {
            if (this.dynamicEffectExtends_.mo17140q()) {
                return;
            }
            this.dynamicEffectExtends_ = GeneratedMessageLite.mutableCopy(this.dynamicEffectExtends_);
        }

        private void ensureUserNameGradientColorsIsMutable() {
            if (this.userNameGradientColors_.mo17140q()) {
                return;
            }
            this.userNameGradientColors_ = GeneratedMessageLite.mutableCopy(this.userNameGradientColors_);
        }

        private void ensureVideoEffectExtrasIsMutable() {
            if (this.videoEffectExtras_.mo17140q()) {
                return;
            }
            this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
        }

        public static UserEnterRoomEffect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHierarchys(Hierarchys hierarchys) {
            Hierarchys hierarchys2 = this.hierarchys_;
            if (hierarchys2 == null || hierarchys2 == Hierarchys.getDefaultInstance()) {
                this.hierarchys_ = hierarchys;
            } else {
                this.hierarchys_ = Hierarchys.newBuilder(this.hierarchys_).mergeFrom(hierarchys).buildPartial();
            }
        }

        public static Builder newBuilder(UserEnterRoomEffect userEnterRoomEffect) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userEnterRoomEffect);
        }

        public static UserEnterRoomEffect parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserEnterRoomEffect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<UserEnterRoomEffect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDynamicEffectExtends(int i) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVideoEffectExtras(int i) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationSizeType(long j) {
            this.animationSizeType_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarGradientDirection(EnterRoomEffectGradientDirection enterRoomEffectGradientDirection) {
            enterRoomEffectGradientDirection.getClass();
            this.avatarGradientDirection_ = enterRoomEffectGradientDirection.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarGradientDirectionValue(int i) {
            this.avatarGradientDirection_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarGradients(int i, String str) {
            str.getClass();
            ensureAvatarGradientsIsMutable();
            this.avatarGradients_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundGradientDirection(EnterRoomEffectGradientDirection enterRoomEffectGradientDirection) {
            enterRoomEffectGradientDirection.getClass();
            this.backgroundGradientDirection_ = enterRoomEffectGradientDirection.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundGradientDirectionValue(int i) {
            this.backgroundGradientDirection_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundGradients(int i, String str) {
            str.getClass();
            ensureBackgroundGradientsIsMutable();
            this.backgroundGradients_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrl(String str) {
            str.getClass();
            this.backgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.backgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundUrlEndMargin(long j) {
            this.backgroundUrlEndMargin_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectId(String str) {
            str.getClass();
            this.effectId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEffectIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.effectId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterVersion(long j) {
            this.enterVersion_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpireTime(long j) {
            this.expireTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedBackgroundUrl(String str) {
            str.getClass();
            this.fixedBackgroundUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedBackgroundUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.fixedBackgroundUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingUrl(String str) {
            str.getClass();
            this.floatingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.floatingUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchys(Hierarchys.Builder builder) {
            this.hierarchys_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInternalText(String str) {
            str.getClass();
            this.internalText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInternalTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.internalText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsWealthHierarchy(boolean z) {
            this.isWealthHierarchy_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewFloatingUrl(String str) {
            str.getClass();
            this.newFloatingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewFloatingUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.newFloatingUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewResourceId(String str) {
            str.getClass();
            this.newResourceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewResourceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.newResourceId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaceType(PlaceType placeType) {
            placeType.getClass();
            this.placeType_ = placeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlaceTypeValue(int i) {
            this.placeType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceId(String str) {
            str.getClass();
            this.resourceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResourceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.resourceId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomId(String str) {
            str.getClass();
            this.roomId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.roomId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowDuration(long j) {
            this.showDuration_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImage(String str) {
            str.getClass();
            this.userImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserImageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.userName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameColor(String str) {
            str.getClass();
            this.userNameColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.userNameColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserNameGradientColors(int i, String str) {
            str.getClass();
            ensureUserNameGradientColorsIsMutable();
            this.userNameGradientColors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45591.f16658xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new UserEnterRoomEffect();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.avatarGradients_.mo17139n();
                    this.backgroundGradients_.mo17139n();
                    this.videoEffectExtras_.mo17139n();
                    this.dynamicEffectExtends_.mo17139n();
                    this.userNameGradientColors_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    UserEnterRoomEffect userEnterRoomEffect = (UserEnterRoomEffect) obj2;
                    this.userId_ = interfaceC3409h.mo17052f(!this.userId_.isEmpty(), this.userId_, !userEnterRoomEffect.userId_.isEmpty(), userEnterRoomEffect.userId_);
                    this.roomId_ = interfaceC3409h.mo17052f(!this.roomId_.isEmpty(), this.roomId_, !userEnterRoomEffect.roomId_.isEmpty(), userEnterRoomEffect.roomId_);
                    this.hierarchys_ = (Hierarchys) interfaceC3409h.mo17061o(this.hierarchys_, userEnterRoomEffect.hierarchys_);
                    this.userName_ = interfaceC3409h.mo17052f(!this.userName_.isEmpty(), this.userName_, !userEnterRoomEffect.userName_.isEmpty(), userEnterRoomEffect.userName_);
                    this.userImage_ = interfaceC3409h.mo17052f(!this.userImage_.isEmpty(), this.userImage_, !userEnterRoomEffect.userImage_.isEmpty(), userEnterRoomEffect.userImage_);
                    this.userNameColor_ = interfaceC3409h.mo17052f(!this.userNameColor_.isEmpty(), this.userNameColor_, !userEnterRoomEffect.userNameColor_.isEmpty(), userEnterRoomEffect.userNameColor_);
                    this.text_ = interfaceC3409h.mo17052f(!this.text_.isEmpty(), this.text_, !userEnterRoomEffect.text_.isEmpty(), userEnterRoomEffect.text_);
                    this.textColor_ = interfaceC3409h.mo17052f(!this.textColor_.isEmpty(), this.textColor_, !userEnterRoomEffect.textColor_.isEmpty(), userEnterRoomEffect.textColor_);
                    this.backgroundUrl_ = interfaceC3409h.mo17052f(!this.backgroundUrl_.isEmpty(), this.backgroundUrl_, !userEnterRoomEffect.backgroundUrl_.isEmpty(), userEnterRoomEffect.backgroundUrl_);
                    this.floatingUrl_ = interfaceC3409h.mo17052f(!this.floatingUrl_.isEmpty(), this.floatingUrl_, !userEnterRoomEffect.floatingUrl_.isEmpty(), userEnterRoomEffect.floatingUrl_);
                    this.resourceId_ = interfaceC3409h.mo17052f(!this.resourceId_.isEmpty(), this.resourceId_, !userEnterRoomEffect.resourceId_.isEmpty(), userEnterRoomEffect.resourceId_);
                    long j = this.showDuration_;
                    boolean z2 = j != 0;
                    long j2 = userEnterRoomEffect.showDuration_;
                    this.showDuration_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    boolean z3 = this.isWealthHierarchy_;
                    boolean z4 = userEnterRoomEffect.isWealthHierarchy_;
                    this.isWealthHierarchy_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    int i = this.avatarGradientDirection_;
                    boolean z5 = i != 0;
                    int i2 = userEnterRoomEffect.avatarGradientDirection_;
                    this.avatarGradientDirection_ = interfaceC3409h.mo17051e(z5, i, i2 != 0, i2);
                    this.avatarGradients_ = interfaceC3409h.mo17053g(this.avatarGradients_, userEnterRoomEffect.avatarGradients_);
                    int i3 = this.backgroundGradientDirection_;
                    boolean z6 = i3 != 0;
                    int i4 = userEnterRoomEffect.backgroundGradientDirection_;
                    this.backgroundGradientDirection_ = interfaceC3409h.mo17051e(z6, i3, i4 != 0, i4);
                    this.backgroundGradients_ = interfaceC3409h.mo17053g(this.backgroundGradients_, userEnterRoomEffect.backgroundGradients_);
                    this.effectId_ = interfaceC3409h.mo17052f(!this.effectId_.isEmpty(), this.effectId_, !userEnterRoomEffect.effectId_.isEmpty(), userEnterRoomEffect.effectId_);
                    this.internalText_ = interfaceC3409h.mo17052f(!this.internalText_.isEmpty(), this.internalText_, !userEnterRoomEffect.internalText_.isEmpty(), userEnterRoomEffect.internalText_);
                    long j3 = this.expireTime_;
                    boolean z7 = j3 != 0;
                    long j4 = userEnterRoomEffect.expireTime_;
                    this.expireTime_ = interfaceC3409h.mo17055i(z7, j3, j4 != 0, j4);
                    long j5 = this.backgroundUrlEndMargin_;
                    boolean z8 = j5 != 0;
                    long j6 = userEnterRoomEffect.backgroundUrlEndMargin_;
                    this.backgroundUrlEndMargin_ = interfaceC3409h.mo17055i(z8, j5, j6 != 0, j6);
                    int i5 = this.placeType_;
                    boolean z9 = i5 != 0;
                    int i6 = userEnterRoomEffect.placeType_;
                    this.placeType_ = interfaceC3409h.mo17051e(z9, i5, i6 != 0, i6);
                    this.fixedBackgroundUrl_ = interfaceC3409h.mo17052f(!this.fixedBackgroundUrl_.isEmpty(), this.fixedBackgroundUrl_, !userEnterRoomEffect.fixedBackgroundUrl_.isEmpty(), userEnterRoomEffect.fixedBackgroundUrl_);
                    long j7 = this.animationSizeType_;
                    boolean z10 = j7 != 0;
                    long j8 = userEnterRoomEffect.animationSizeType_;
                    this.animationSizeType_ = interfaceC3409h.mo17055i(z10, j7, j8 != 0, j8);
                    long j9 = this.enterVersion_;
                    boolean z11 = j9 != 0;
                    long j10 = userEnterRoomEffect.enterVersion_;
                    this.enterVersion_ = interfaceC3409h.mo17055i(z11, j9, j10 != 0, j10);
                    this.videoEffectExtras_ = interfaceC3409h.mo17053g(this.videoEffectExtras_, userEnterRoomEffect.videoEffectExtras_);
                    this.newFloatingUrl_ = interfaceC3409h.mo17052f(!this.newFloatingUrl_.isEmpty(), this.newFloatingUrl_, !userEnterRoomEffect.newFloatingUrl_.isEmpty(), userEnterRoomEffect.newFloatingUrl_);
                    this.newResourceId_ = interfaceC3409h.mo17052f(!this.newResourceId_.isEmpty(), this.newResourceId_, !userEnterRoomEffect.newResourceId_.isEmpty(), userEnterRoomEffect.newResourceId_);
                    this.dynamicEffectExtends_ = interfaceC3409h.mo17053g(this.dynamicEffectExtends_, userEnterRoomEffect.dynamicEffectExtends_);
                    this.userNameGradientColors_ = interfaceC3409h.mo17053g(this.userNameGradientColors_, userEnterRoomEffect.userNameGradientColors_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= userEnterRoomEffect.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            switch (iM17171M) {
                                case 0:
                                    break;
                                case 10:
                                    this.userId_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.roomId_ = c3430e.m17170L();
                                    continue;
                                case 26:
                                    Hierarchys hierarchys = this.hierarchys_;
                                    Hierarchys.Builder builder = hierarchys != null ? hierarchys.toBuilder() : null;
                                    Hierarchys hierarchys2 = (Hierarchys) c3430e.m17198w(Hierarchys.parser(), c3433h);
                                    this.hierarchys_ = hierarchys2;
                                    if (builder != null) {
                                        builder.mergeFrom(hierarchys2);
                                        this.hierarchys_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 34:
                                    this.userName_ = c3430e.m17170L();
                                    continue;
                                case 42:
                                    this.userImage_ = c3430e.m17170L();
                                    continue;
                                case 50:
                                    this.userNameColor_ = c3430e.m17170L();
                                    continue;
                                case 58:
                                    this.text_ = c3430e.m17170L();
                                    continue;
                                case 66:
                                    this.textColor_ = c3430e.m17170L();
                                    continue;
                                case 74:
                                    this.backgroundUrl_ = c3430e.m17170L();
                                    continue;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.floatingUrl_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    this.resourceId_ = c3430e.m17170L();
                                    continue;
                                case Opcodes.IADD /* 96 */:
                                    this.showDuration_ = c3430e.m17197v();
                                    continue;
                                case 104:
                                    this.isWealthHierarchy_ = c3430e.m17188m();
                                    continue;
                                case 112:
                                    this.avatarGradientDirection_ = c3430e.m17191p();
                                    continue;
                                case 122:
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.avatarGradients_.mo17140q()) {
                                        this.avatarGradients_ = GeneratedMessageLite.mutableCopy(this.avatarGradients_);
                                    }
                                    this.avatarGradients_.add(strM17170L);
                                    continue;
                                case 128:
                                    this.backgroundGradientDirection_ = c3430e.m17191p();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                    String strM17170L2 = c3430e.m17170L();
                                    if (!this.backgroundGradients_.mo17140q()) {
                                        this.backgroundGradients_ = GeneratedMessageLite.mutableCopy(this.backgroundGradients_);
                                    }
                                    this.backgroundGradients_.add(strM17170L2);
                                    continue;
                                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                    this.effectId_ = c3430e.m17170L();
                                    continue;
                                case 154:
                                    this.internalText_ = c3430e.m17170L();
                                    continue;
                                case 160:
                                    this.expireTime_ = c3430e.m17197v();
                                    continue;
                                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    this.backgroundUrlEndMargin_ = c3430e.m17197v();
                                    continue;
                                case 176:
                                    this.placeType_ = c3430e.m17191p();
                                    continue;
                                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                    this.fixedBackgroundUrl_ = c3430e.m17170L();
                                    continue;
                                case 192:
                                    this.animationSizeType_ = c3430e.m17197v();
                                    continue;
                                case 200:
                                    this.enterVersion_ = c3430e.m17197v();
                                    continue;
                                case 210:
                                    if (!this.videoEffectExtras_.mo17140q()) {
                                        this.videoEffectExtras_ = GeneratedMessageLite.mutableCopy(this.videoEffectExtras_);
                                    }
                                    this.videoEffectExtras_.add((VideoEffectExtra) c3430e.m17198w(VideoEffectExtra.parser(), c3433h));
                                    continue;
                                case 218:
                                    this.newFloatingUrl_ = c3430e.m17170L();
                                    continue;
                                case 226:
                                    this.newResourceId_ = c3430e.m17170L();
                                    continue;
                                case 234:
                                    if (!this.dynamicEffectExtends_.mo17140q()) {
                                        this.dynamicEffectExtends_ = GeneratedMessageLite.mutableCopy(this.dynamicEffectExtends_);
                                    }
                                    this.dynamicEffectExtends_.add((LongLinkGiftMessage.DynamicEffectExtend) c3430e.m17198w(LongLinkGiftMessage.DynamicEffectExtend.parser(), c3433h));
                                    continue;
                                case 242:
                                    String strM17170L3 = c3430e.m17170L();
                                    if (!this.userNameGradientColors_.mo17140q()) {
                                        this.userNameGradientColors_ = GeneratedMessageLite.mutableCopy(this.userNameGradientColors_);
                                    }
                                    this.userNameGradientColors_.add(strM17170L3);
                                    continue;
                                default:
                                    if (!c3430e.m17176R(iM17171M)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (UserEnterRoomEffect.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public long getAnimationSizeType() {
            return this.animationSizeType_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public EnterRoomEffectGradientDirection getAvatarGradientDirection() {
            EnterRoomEffectGradientDirection enterRoomEffectGradientDirectionForNumber = EnterRoomEffectGradientDirection.forNumber(this.avatarGradientDirection_);
            return enterRoomEffectGradientDirectionForNumber == null ? EnterRoomEffectGradientDirection.UNRECOGNIZED : enterRoomEffectGradientDirectionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getAvatarGradientDirectionValue() {
            return this.avatarGradientDirection_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getAvatarGradients(int i) {
            return this.avatarGradients_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getAvatarGradientsBytes(int i) {
            return ByteString.copyFromUtf8(this.avatarGradients_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getAvatarGradientsCount() {
            return this.avatarGradients_.size();
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public List<String> getAvatarGradientsList() {
            return this.avatarGradients_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public EnterRoomEffectGradientDirection getBackgroundGradientDirection() {
            EnterRoomEffectGradientDirection enterRoomEffectGradientDirectionForNumber = EnterRoomEffectGradientDirection.forNumber(this.backgroundGradientDirection_);
            return enterRoomEffectGradientDirectionForNumber == null ? EnterRoomEffectGradientDirection.UNRECOGNIZED : enterRoomEffectGradientDirectionForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getBackgroundGradientDirectionValue() {
            return this.backgroundGradientDirection_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getBackgroundGradients(int i) {
            return this.backgroundGradients_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getBackgroundGradientsBytes(int i) {
            return ByteString.copyFromUtf8(this.backgroundGradients_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getBackgroundGradientsCount() {
            return this.backgroundGradients_.size();
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public List<String> getBackgroundGradientsList() {
            return this.backgroundGradients_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getBackgroundUrl() {
            return this.backgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.backgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public long getBackgroundUrlEndMargin() {
            return this.backgroundUrlEndMargin_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public LongLinkGiftMessage.DynamicEffectExtend getDynamicEffectExtends(int i) {
            return this.dynamicEffectExtends_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getDynamicEffectExtendsCount() {
            return this.dynamicEffectExtends_.size();
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public List<LongLinkGiftMessage.DynamicEffectExtend> getDynamicEffectExtendsList() {
            return this.dynamicEffectExtends_;
        }

        public LongLinkGiftMessage.DynamicEffectExtendOrBuilder getDynamicEffectExtendsOrBuilder(int i) {
            return this.dynamicEffectExtends_.get(i);
        }

        public List<? extends LongLinkGiftMessage.DynamicEffectExtendOrBuilder> getDynamicEffectExtendsOrBuilderList() {
            return this.dynamicEffectExtends_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getEffectId() {
            return this.effectId_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getEffectIdBytes() {
            return ByteString.copyFromUtf8(this.effectId_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public long getEnterVersion() {
            return this.enterVersion_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public long getExpireTime() {
            return this.expireTime_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getFixedBackgroundUrl() {
            return this.fixedBackgroundUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getFixedBackgroundUrlBytes() {
            return ByteString.copyFromUtf8(this.fixedBackgroundUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getFloatingUrl() {
            return this.floatingUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getFloatingUrlBytes() {
            return ByteString.copyFromUtf8(this.floatingUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public Hierarchys getHierarchys() {
            Hierarchys hierarchys = this.hierarchys_;
            return hierarchys == null ? Hierarchys.getDefaultInstance() : hierarchys;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getInternalText() {
            return this.internalText_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getInternalTextBytes() {
            return ByteString.copyFromUtf8(this.internalText_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public boolean getIsWealthHierarchy() {
            return this.isWealthHierarchy_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getNewFloatingUrl() {
            return this.newFloatingUrl_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getNewFloatingUrlBytes() {
            return ByteString.copyFromUtf8(this.newFloatingUrl_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getNewResourceId() {
            return this.newResourceId_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getNewResourceIdBytes() {
            return ByteString.copyFromUtf8(this.newResourceId_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public PlaceType getPlaceType() {
            PlaceType placeTypeForNumber = PlaceType.forNumber(this.placeType_);
            return placeTypeForNumber == null ? PlaceType.UNRECOGNIZED : placeTypeForNumber;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getPlaceTypeValue() {
            return this.placeType_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getResourceId() {
            return this.resourceId_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getResourceIdBytes() {
            return ByteString.copyFromUtf8(this.resourceId_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getRoomId() {
            return this.roomId_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getRoomIdBytes() {
            return ByteString.copyFromUtf8(this.roomId_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.userId_.isEmpty() ? CodedOutputStream.m16956K(1, getUserId()) : 0;
            if (!this.roomId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getRoomId());
            }
            if (this.hierarchys_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getHierarchys());
            }
            if (!this.userName_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getUserName());
            }
            if (!this.userImage_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getUserImage());
            }
            if (!this.userNameColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getUserNameColor());
            }
            if (!this.text_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getText());
            }
            if (!this.textColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getTextColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(9, getBackgroundUrl());
            }
            if (!this.floatingUrl_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getFloatingUrl());
            }
            if (!this.resourceId_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(11, getResourceId());
            }
            long j = this.showDuration_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(12, j);
            }
            boolean z = this.isWealthHierarchy_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(13, z);
            }
            if (this.avatarGradientDirection_ != EnterRoomEffectGradientDirection.unknow.getNumber()) {
                iM16956K += CodedOutputStream.m16977m(14, this.avatarGradientDirection_);
            }
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.avatarGradients_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.avatarGradients_.get(i2));
            }
            int size = iM16956K + iM16957L + getAvatarGradientsList().size();
            if (this.backgroundGradientDirection_ != EnterRoomEffectGradientDirection.unknow.getNumber()) {
                size += CodedOutputStream.m16977m(16, this.backgroundGradientDirection_);
            }
            int iM16957L2 = 0;
            for (int i3 = 0; i3 < this.backgroundGradients_.size(); i3++) {
                iM16957L2 += CodedOutputStream.m16957L(this.backgroundGradients_.get(i3));
            }
            int size2 = size + iM16957L2 + (getBackgroundGradientsList().size() * 2);
            if (!this.effectId_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(18, getEffectId());
            }
            if (!this.internalText_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(19, getInternalText());
            }
            long j2 = this.expireTime_;
            if (j2 != 0) {
                size2 += CodedOutputStream.m16986v(20, j2);
            }
            long j3 = this.backgroundUrlEndMargin_;
            if (j3 != 0) {
                size2 += CodedOutputStream.m16986v(21, j3);
            }
            if (this.placeType_ != PlaceType.videoRoom.getNumber()) {
                size2 += CodedOutputStream.m16977m(22, this.placeType_);
            }
            if (!this.fixedBackgroundUrl_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(23, getFixedBackgroundUrl());
            }
            long j4 = this.animationSizeType_;
            if (j4 != 0) {
                size2 += CodedOutputStream.m16986v(24, j4);
            }
            long j5 = this.enterVersion_;
            if (j5 != 0) {
                size2 += CodedOutputStream.m16986v(25, j5);
            }
            for (int i4 = 0; i4 < this.videoEffectExtras_.size(); i4++) {
                size2 += CodedOutputStream.m16948C(26, this.videoEffectExtras_.get(i4));
            }
            if (!this.newFloatingUrl_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(27, getNewFloatingUrl());
            }
            if (!this.newResourceId_.isEmpty()) {
                size2 += CodedOutputStream.m16956K(28, getNewResourceId());
            }
            for (int i5 = 0; i5 < this.dynamicEffectExtends_.size(); i5++) {
                size2 += CodedOutputStream.m16948C(29, this.dynamicEffectExtends_.get(i5));
            }
            int iM16957L3 = 0;
            for (int i6 = 0; i6 < this.userNameGradientColors_.size(); i6++) {
                iM16957L3 += CodedOutputStream.m16957L(this.userNameGradientColors_.get(i6));
            }
            int size3 = size2 + iM16957L3 + (getUserNameGradientColorsList().size() * 2);
            this.memoizedSerializedSize = size3;
            return size3;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public long getShowDuration() {
            return this.showDuration_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getTextColor() {
            return this.textColor_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getUserImage() {
            return this.userImage_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getUserImageBytes() {
            return ByteString.copyFromUtf8(this.userImage_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getUserName() {
            return this.userName_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getUserNameBytes() {
            return ByteString.copyFromUtf8(this.userName_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getUserNameColor() {
            return this.userNameColor_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getUserNameColorBytes() {
            return ByteString.copyFromUtf8(this.userNameColor_);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public String getUserNameGradientColors(int i) {
            return this.userNameGradientColors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public ByteString getUserNameGradientColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.userNameGradientColors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getUserNameGradientColorsCount() {
            return this.userNameGradientColors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public List<String> getUserNameGradientColorsList() {
            return this.userNameGradientColors_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public VideoEffectExtra getVideoEffectExtras(int i) {
            return this.videoEffectExtras_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public int getVideoEffectExtrasCount() {
            return this.videoEffectExtras_.size();
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public List<VideoEffectExtra> getVideoEffectExtrasList() {
            return this.videoEffectExtras_;
        }

        public VideoEffectExtraOrBuilder getVideoEffectExtrasOrBuilder(int i) {
            return this.videoEffectExtras_.get(i);
        }

        public List<? extends VideoEffectExtraOrBuilder> getVideoEffectExtrasOrBuilderList() {
            return this.videoEffectExtras_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
        public boolean hasHierarchys() {
            return this.hierarchys_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.userId_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUserId());
            }
            if (!this.roomId_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getRoomId());
            }
            if (this.hierarchys_ != null) {
                codedOutputStream.mo17029w0(3, getHierarchys());
            }
            if (!this.userName_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getUserName());
            }
            if (!this.userImage_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getUserImage());
            }
            if (!this.userNameColor_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getUserNameColor());
            }
            if (!this.text_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getText());
            }
            if (!this.textColor_.isEmpty()) {
                codedOutputStream.mo16994D0(8, getTextColor());
            }
            if (!this.backgroundUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(9, getBackgroundUrl());
            }
            if (!this.floatingUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getFloatingUrl());
            }
            if (!this.resourceId_.isEmpty()) {
                codedOutputStream.mo16994D0(11, getResourceId());
            }
            long j = this.showDuration_;
            if (j != 0) {
                codedOutputStream.m17027u0(12, j);
            }
            boolean z = this.isWealthHierarchy_;
            if (z) {
                codedOutputStream.mo17005a0(13, z);
            }
            if (this.avatarGradientDirection_ != EnterRoomEffectGradientDirection.unknow.getNumber()) {
                codedOutputStream.m17015i0(14, this.avatarGradientDirection_);
            }
            for (int i = 0; i < this.avatarGradients_.size(); i++) {
                codedOutputStream.mo16994D0(15, this.avatarGradients_.get(i));
            }
            if (this.backgroundGradientDirection_ != EnterRoomEffectGradientDirection.unknow.getNumber()) {
                codedOutputStream.m17015i0(16, this.backgroundGradientDirection_);
            }
            for (int i2 = 0; i2 < this.backgroundGradients_.size(); i2++) {
                codedOutputStream.mo16994D0(17, this.backgroundGradients_.get(i2));
            }
            if (!this.effectId_.isEmpty()) {
                codedOutputStream.mo16994D0(18, getEffectId());
            }
            if (!this.internalText_.isEmpty()) {
                codedOutputStream.mo16994D0(19, getInternalText());
            }
            long j2 = this.expireTime_;
            if (j2 != 0) {
                codedOutputStream.m17027u0(20, j2);
            }
            long j3 = this.backgroundUrlEndMargin_;
            if (j3 != 0) {
                codedOutputStream.m17027u0(21, j3);
            }
            if (this.placeType_ != PlaceType.videoRoom.getNumber()) {
                codedOutputStream.m17015i0(22, this.placeType_);
            }
            if (!this.fixedBackgroundUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(23, getFixedBackgroundUrl());
            }
            long j4 = this.animationSizeType_;
            if (j4 != 0) {
                codedOutputStream.m17027u0(24, j4);
            }
            long j5 = this.enterVersion_;
            if (j5 != 0) {
                codedOutputStream.m17027u0(25, j5);
            }
            for (int i3 = 0; i3 < this.videoEffectExtras_.size(); i3++) {
                codedOutputStream.mo17029w0(26, this.videoEffectExtras_.get(i3));
            }
            if (!this.newFloatingUrl_.isEmpty()) {
                codedOutputStream.mo16994D0(27, getNewFloatingUrl());
            }
            if (!this.newResourceId_.isEmpty()) {
                codedOutputStream.mo16994D0(28, getNewResourceId());
            }
            for (int i4 = 0; i4 < this.dynamicEffectExtends_.size(); i4++) {
                codedOutputStream.mo17029w0(29, this.dynamicEffectExtends_.get(i4));
            }
            for (int i5 = 0; i5 < this.userNameGradientColors_.size(); i5++) {
                codedOutputStream.mo16994D0(30, this.userNameGradientColors_.get(i5));
            }
        }

        public static UserEnterRoomEffect parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserEnterRoomEffect parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHierarchys(Hierarchys hierarchys) {
            hierarchys.getClass();
            this.hierarchys_ = hierarchys;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<UserEnterRoomEffect, Builder> implements UserEnterRoomEffectOrBuilder {
            private Builder() {
                super(UserEnterRoomEffect.DEFAULT_INSTANCE);
            }

            public Builder addAllAvatarGradients(Iterable<String> iterable) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAllAvatarGradients(iterable);
                return this;
            }

            public Builder addAllBackgroundGradients(Iterable<String> iterable) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAllBackgroundGradients(iterable);
                return this;
            }

            public Builder addAllDynamicEffectExtends(Iterable<? extends LongLinkGiftMessage.DynamicEffectExtend> iterable) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAllDynamicEffectExtends(iterable);
                return this;
            }

            public Builder addAllUserNameGradientColors(Iterable<String> iterable) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAllUserNameGradientColors(iterable);
                return this;
            }

            public Builder addAllVideoEffectExtras(Iterable<? extends VideoEffectExtra> iterable) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAllVideoEffectExtras(iterable);
                return this;
            }

            public Builder addAvatarGradients(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAvatarGradients(str);
                return this;
            }

            public Builder addAvatarGradientsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addAvatarGradientsBytes(byteString);
                return this;
            }

            public Builder addBackgroundGradients(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addBackgroundGradients(str);
                return this;
            }

            public Builder addBackgroundGradientsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addBackgroundGradientsBytes(byteString);
                return this;
            }

            public Builder addDynamicEffectExtends(LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addDynamicEffectExtends(dynamicEffectExtend);
                return this;
            }

            public Builder addUserNameGradientColors(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addUserNameGradientColors(str);
                return this;
            }

            public Builder addUserNameGradientColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addUserNameGradientColorsBytes(byteString);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addVideoEffectExtras(videoEffectExtra);
                return this;
            }

            public Builder clearAnimationSizeType() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearAnimationSizeType();
                return this;
            }

            public Builder clearAvatarGradientDirection() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearAvatarGradientDirection();
                return this;
            }

            public Builder clearAvatarGradients() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearAvatarGradients();
                return this;
            }

            public Builder clearBackgroundGradientDirection() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearBackgroundGradientDirection();
                return this;
            }

            public Builder clearBackgroundGradients() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearBackgroundGradients();
                return this;
            }

            public Builder clearBackgroundUrl() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearBackgroundUrl();
                return this;
            }

            public Builder clearBackgroundUrlEndMargin() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearBackgroundUrlEndMargin();
                return this;
            }

            public Builder clearDynamicEffectExtends() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearDynamicEffectExtends();
                return this;
            }

            public Builder clearEffectId() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearEffectId();
                return this;
            }

            public Builder clearEnterVersion() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearEnterVersion();
                return this;
            }

            public Builder clearExpireTime() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearExpireTime();
                return this;
            }

            public Builder clearFixedBackgroundUrl() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearFixedBackgroundUrl();
                return this;
            }

            public Builder clearFloatingUrl() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearFloatingUrl();
                return this;
            }

            public Builder clearHierarchys() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearHierarchys();
                return this;
            }

            public Builder clearInternalText() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearInternalText();
                return this;
            }

            public Builder clearIsWealthHierarchy() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearIsWealthHierarchy();
                return this;
            }

            public Builder clearNewFloatingUrl() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearNewFloatingUrl();
                return this;
            }

            public Builder clearNewResourceId() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearNewResourceId();
                return this;
            }

            public Builder clearPlaceType() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearPlaceType();
                return this;
            }

            public Builder clearResourceId() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearResourceId();
                return this;
            }

            public Builder clearRoomId() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearRoomId();
                return this;
            }

            public Builder clearShowDuration() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearShowDuration();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearText();
                return this;
            }

            public Builder clearTextColor() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearTextColor();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearUserId();
                return this;
            }

            public Builder clearUserImage() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearUserImage();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearUserName();
                return this;
            }

            public Builder clearUserNameColor() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearUserNameColor();
                return this;
            }

            public Builder clearUserNameGradientColors() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearUserNameGradientColors();
                return this;
            }

            public Builder clearVideoEffectExtras() {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).clearVideoEffectExtras();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public long getAnimationSizeType() {
                return ((UserEnterRoomEffect) this.instance).getAnimationSizeType();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public EnterRoomEffectGradientDirection getAvatarGradientDirection() {
                return ((UserEnterRoomEffect) this.instance).getAvatarGradientDirection();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getAvatarGradientDirectionValue() {
                return ((UserEnterRoomEffect) this.instance).getAvatarGradientDirectionValue();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getAvatarGradients(int i) {
                return ((UserEnterRoomEffect) this.instance).getAvatarGradients(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getAvatarGradientsBytes(int i) {
                return ((UserEnterRoomEffect) this.instance).getAvatarGradientsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getAvatarGradientsCount() {
                return ((UserEnterRoomEffect) this.instance).getAvatarGradientsCount();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public List<String> getAvatarGradientsList() {
                return Collections.unmodifiableList(((UserEnterRoomEffect) this.instance).getAvatarGradientsList());
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public EnterRoomEffectGradientDirection getBackgroundGradientDirection() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundGradientDirection();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getBackgroundGradientDirectionValue() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundGradientDirectionValue();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getBackgroundGradients(int i) {
                return ((UserEnterRoomEffect) this.instance).getBackgroundGradients(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getBackgroundGradientsBytes(int i) {
                return ((UserEnterRoomEffect) this.instance).getBackgroundGradientsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getBackgroundGradientsCount() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundGradientsCount();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public List<String> getBackgroundGradientsList() {
                return Collections.unmodifiableList(((UserEnterRoomEffect) this.instance).getBackgroundGradientsList());
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getBackgroundUrl() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getBackgroundUrlBytes() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public long getBackgroundUrlEndMargin() {
                return ((UserEnterRoomEffect) this.instance).getBackgroundUrlEndMargin();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public LongLinkGiftMessage.DynamicEffectExtend getDynamicEffectExtends(int i) {
                return ((UserEnterRoomEffect) this.instance).getDynamicEffectExtends(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getDynamicEffectExtendsCount() {
                return ((UserEnterRoomEffect) this.instance).getDynamicEffectExtendsCount();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public List<LongLinkGiftMessage.DynamicEffectExtend> getDynamicEffectExtendsList() {
                return Collections.unmodifiableList(((UserEnterRoomEffect) this.instance).getDynamicEffectExtendsList());
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getEffectId() {
                return ((UserEnterRoomEffect) this.instance).getEffectId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getEffectIdBytes() {
                return ((UserEnterRoomEffect) this.instance).getEffectIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public long getEnterVersion() {
                return ((UserEnterRoomEffect) this.instance).getEnterVersion();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public long getExpireTime() {
                return ((UserEnterRoomEffect) this.instance).getExpireTime();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getFixedBackgroundUrl() {
                return ((UserEnterRoomEffect) this.instance).getFixedBackgroundUrl();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getFixedBackgroundUrlBytes() {
                return ((UserEnterRoomEffect) this.instance).getFixedBackgroundUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getFloatingUrl() {
                return ((UserEnterRoomEffect) this.instance).getFloatingUrl();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getFloatingUrlBytes() {
                return ((UserEnterRoomEffect) this.instance).getFloatingUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public Hierarchys getHierarchys() {
                return ((UserEnterRoomEffect) this.instance).getHierarchys();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getInternalText() {
                return ((UserEnterRoomEffect) this.instance).getInternalText();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getInternalTextBytes() {
                return ((UserEnterRoomEffect) this.instance).getInternalTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public boolean getIsWealthHierarchy() {
                return ((UserEnterRoomEffect) this.instance).getIsWealthHierarchy();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getNewFloatingUrl() {
                return ((UserEnterRoomEffect) this.instance).getNewFloatingUrl();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getNewFloatingUrlBytes() {
                return ((UserEnterRoomEffect) this.instance).getNewFloatingUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getNewResourceId() {
                return ((UserEnterRoomEffect) this.instance).getNewResourceId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getNewResourceIdBytes() {
                return ((UserEnterRoomEffect) this.instance).getNewResourceIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public PlaceType getPlaceType() {
                return ((UserEnterRoomEffect) this.instance).getPlaceType();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getPlaceTypeValue() {
                return ((UserEnterRoomEffect) this.instance).getPlaceTypeValue();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getResourceId() {
                return ((UserEnterRoomEffect) this.instance).getResourceId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getResourceIdBytes() {
                return ((UserEnterRoomEffect) this.instance).getResourceIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getRoomId() {
                return ((UserEnterRoomEffect) this.instance).getRoomId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getRoomIdBytes() {
                return ((UserEnterRoomEffect) this.instance).getRoomIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public long getShowDuration() {
                return ((UserEnterRoomEffect) this.instance).getShowDuration();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getText() {
                return ((UserEnterRoomEffect) this.instance).getText();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getTextBytes() {
                return ((UserEnterRoomEffect) this.instance).getTextBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getTextColor() {
                return ((UserEnterRoomEffect) this.instance).getTextColor();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getTextColorBytes() {
                return ((UserEnterRoomEffect) this.instance).getTextColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getUserId() {
                return ((UserEnterRoomEffect) this.instance).getUserId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getUserIdBytes() {
                return ((UserEnterRoomEffect) this.instance).getUserIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getUserImage() {
                return ((UserEnterRoomEffect) this.instance).getUserImage();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getUserImageBytes() {
                return ((UserEnterRoomEffect) this.instance).getUserImageBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getUserName() {
                return ((UserEnterRoomEffect) this.instance).getUserName();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getUserNameBytes() {
                return ((UserEnterRoomEffect) this.instance).getUserNameBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getUserNameColor() {
                return ((UserEnterRoomEffect) this.instance).getUserNameColor();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getUserNameColorBytes() {
                return ((UserEnterRoomEffect) this.instance).getUserNameColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public String getUserNameGradientColors(int i) {
                return ((UserEnterRoomEffect) this.instance).getUserNameGradientColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public ByteString getUserNameGradientColorsBytes(int i) {
                return ((UserEnterRoomEffect) this.instance).getUserNameGradientColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getUserNameGradientColorsCount() {
                return ((UserEnterRoomEffect) this.instance).getUserNameGradientColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public List<String> getUserNameGradientColorsList() {
                return Collections.unmodifiableList(((UserEnterRoomEffect) this.instance).getUserNameGradientColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public VideoEffectExtra getVideoEffectExtras(int i) {
                return ((UserEnterRoomEffect) this.instance).getVideoEffectExtras(i);
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public int getVideoEffectExtrasCount() {
                return ((UserEnterRoomEffect) this.instance).getVideoEffectExtrasCount();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public List<VideoEffectExtra> getVideoEffectExtrasList() {
                return Collections.unmodifiableList(((UserEnterRoomEffect) this.instance).getVideoEffectExtrasList());
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.UserEnterRoomEffectOrBuilder
            public boolean hasHierarchys() {
                return ((UserEnterRoomEffect) this.instance).hasHierarchys();
            }

            public Builder mergeHierarchys(Hierarchys hierarchys) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).mergeHierarchys(hierarchys);
                return this;
            }

            public Builder removeDynamicEffectExtends(int i) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).removeDynamicEffectExtends(i);
                return this;
            }

            public Builder removeVideoEffectExtras(int i) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).removeVideoEffectExtras(i);
                return this;
            }

            public Builder setAnimationSizeType(long j) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setAnimationSizeType(j);
                return this;
            }

            public Builder setAvatarGradientDirection(EnterRoomEffectGradientDirection enterRoomEffectGradientDirection) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setAvatarGradientDirection(enterRoomEffectGradientDirection);
                return this;
            }

            public Builder setAvatarGradientDirectionValue(int i) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setAvatarGradientDirectionValue(i);
                return this;
            }

            public Builder setAvatarGradients(int i, String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setAvatarGradients(i, str);
                return this;
            }

            public Builder setBackgroundGradientDirection(EnterRoomEffectGradientDirection enterRoomEffectGradientDirection) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundGradientDirection(enterRoomEffectGradientDirection);
                return this;
            }

            public Builder setBackgroundGradientDirectionValue(int i) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundGradientDirectionValue(i);
                return this;
            }

            public Builder setBackgroundGradients(int i, String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundGradients(i, str);
                return this;
            }

            public Builder setBackgroundUrl(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundUrl(str);
                return this;
            }

            public Builder setBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setBackgroundUrlEndMargin(long j) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setBackgroundUrlEndMargin(j);
                return this;
            }

            public Builder setDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setDynamicEffectExtends(i, dynamicEffectExtend);
                return this;
            }

            public Builder setEffectId(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setEffectId(str);
                return this;
            }

            public Builder setEffectIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setEffectIdBytes(byteString);
                return this;
            }

            public Builder setEnterVersion(long j) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setEnterVersion(j);
                return this;
            }

            public Builder setExpireTime(long j) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setExpireTime(j);
                return this;
            }

            public Builder setFixedBackgroundUrl(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setFixedBackgroundUrl(str);
                return this;
            }

            public Builder setFixedBackgroundUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setFixedBackgroundUrlBytes(byteString);
                return this;
            }

            public Builder setFloatingUrl(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setFloatingUrl(str);
                return this;
            }

            public Builder setFloatingUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setFloatingUrlBytes(byteString);
                return this;
            }

            public Builder setHierarchys(Hierarchys hierarchys) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setHierarchys(hierarchys);
                return this;
            }

            public Builder setInternalText(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setInternalText(str);
                return this;
            }

            public Builder setInternalTextBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setInternalTextBytes(byteString);
                return this;
            }

            public Builder setIsWealthHierarchy(boolean z) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setIsWealthHierarchy(z);
                return this;
            }

            public Builder setNewFloatingUrl(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setNewFloatingUrl(str);
                return this;
            }

            public Builder setNewFloatingUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setNewFloatingUrlBytes(byteString);
                return this;
            }

            public Builder setNewResourceId(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setNewResourceId(str);
                return this;
            }

            public Builder setNewResourceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setNewResourceIdBytes(byteString);
                return this;
            }

            public Builder setPlaceType(PlaceType placeType) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setPlaceType(placeType);
                return this;
            }

            public Builder setPlaceTypeValue(int i) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setPlaceTypeValue(i);
                return this;
            }

            public Builder setResourceId(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setResourceId(str);
                return this;
            }

            public Builder setResourceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setResourceIdBytes(byteString);
                return this;
            }

            public Builder setRoomId(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setRoomId(str);
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setRoomIdBytes(byteString);
                return this;
            }

            public Builder setShowDuration(long j) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setShowDuration(j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setTextBytes(byteString);
                return this;
            }

            public Builder setTextColor(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setTextColor(str);
                return this;
            }

            public Builder setTextColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setTextColorBytes(byteString);
                return this;
            }

            public Builder setUserId(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserId(str);
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserIdBytes(byteString);
                return this;
            }

            public Builder setUserImage(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserImage(str);
                return this;
            }

            public Builder setUserImageBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserImageBytes(byteString);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserNameBytes(byteString);
                return this;
            }

            public Builder setUserNameColor(String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserNameColor(str);
                return this;
            }

            public Builder setUserNameColorBytes(ByteString byteString) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserNameColorBytes(byteString);
                return this;
            }

            public Builder setUserNameGradientColors(int i, String str) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setUserNameGradientColors(i, str);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder addDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addDynamicEffectExtends(i, dynamicEffectExtend);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addVideoEffectExtras(i, videoEffectExtra);
                return this;
            }

            public Builder setDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setDynamicEffectExtends(i, builder);
                return this;
            }

            public Builder setHierarchys(Hierarchys.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setHierarchys(builder);
                return this;
            }

            public Builder setVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).setVideoEffectExtras(i, builder);
                return this;
            }

            public Builder addDynamicEffectExtends(LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addDynamicEffectExtends(builder);
                return this;
            }

            public Builder addVideoEffectExtras(VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addVideoEffectExtras(builder);
                return this;
            }

            public Builder addDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addDynamicEffectExtends(i, builder);
                return this;
            }

            public Builder addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
                copyOnWrite();
                ((UserEnterRoomEffect) this.instance).addVideoEffectExtras(i, builder);
                return this;
            }
        }

        public static UserEnterRoomEffect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserEnterRoomEffect parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static UserEnterRoomEffect parseFrom(InputStream inputStream) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserEnterRoomEffect parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static UserEnterRoomEffect parseFrom(C3430e c3430e) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(i, dynamicEffectExtend);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, videoEffectExtra);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserEnterRoomEffect parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (UserEnterRoomEffect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.set(i, dynamicEffectExtend);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoEffectExtras(int i, VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.set(i, videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(LongLinkGiftMessage.DynamicEffectExtend dynamicEffectExtend) {
            dynamicEffectExtend.getClass();
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(dynamicEffectExtend);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(VideoEffectExtra videoEffectExtra) {
            videoEffectExtra.getClass();
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(videoEffectExtra);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDynamicEffectExtends(int i, LongLinkGiftMessage.DynamicEffectExtend.Builder builder) {
            ensureDynamicEffectExtendsIsMutable();
            this.dynamicEffectExtends_.add(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVideoEffectExtras(int i, VideoEffectExtra.Builder builder) {
            ensureVideoEffectExtrasIsMutable();
            this.videoEffectExtras_.add(i, builder.build());
        }
    }

    public static final class VideoEffectExtra extends GeneratedMessageLite<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
        private static final VideoEffectExtra DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<VideoEffectExtra> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long type_;
        private String id_ = "";
        private String value_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<VideoEffectExtra, Builder> implements VideoEffectExtraOrBuilder {
            private Builder() {
                super(VideoEffectExtra.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
            public String getId() {
                return ((VideoEffectExtra) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
            public ByteString getIdBytes() {
                return ((VideoEffectExtra) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
            public long getType() {
                return ((VideoEffectExtra) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
            public String getValue() {
                return ((VideoEffectExtra) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
            public ByteString getValueBytes() {
                return ((VideoEffectExtra) this.instance).getValueBytes();
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(long j) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setType(j);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((VideoEffectExtra) this.instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            VideoEffectExtra videoEffectExtra = new VideoEffectExtra();
            DEFAULT_INSTANCE = videoEffectExtra;
            videoEffectExtra.makeImmutable();
        }

        private VideoEffectExtra() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static VideoEffectExtra getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(VideoEffectExtra videoEffectExtra) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoEffectExtra);
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<VideoEffectExtra> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(long j) {
            this.type_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C45591.f16658xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VideoEffectExtra();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    VideoEffectExtra videoEffectExtra = (VideoEffectExtra) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !videoEffectExtra.id_.isEmpty(), videoEffectExtra.id_);
                    long j = this.type_;
                    boolean z2 = j != 0;
                    long j2 = videoEffectExtra.type_;
                    this.type_ = interfaceC3409h.mo17055i(z2, j, j2 != 0, j2);
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !videoEffectExtra.value_.isEmpty(), videoEffectExtra.value_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 16) {
                                    this.type_ = c3430e.m17197v();
                                } else if (iM17171M == 26) {
                                    this.value_ = c3430e.m17170L();
                                } else if (!c3430e.m17176R(iM17171M)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            iig0.m140070a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            iig0.m140070a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (VideoEffectExtra.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.C3404c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    l710.m153113a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            long j = this.type_;
            if (j != 0) {
                iM16956K += CodedOutputStream.m16986v(2, j);
            }
            if (!this.value_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getValue());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
        public long getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.enterroomeffect.LongLinkEnterRoomMessage.VideoEffectExtraOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            long j = this.type_;
            if (j != 0) {
                codedOutputStream.m17027u0(2, j);
            }
            if (this.value_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(3, getValue());
        }

        public static VideoEffectExtra parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoEffectExtra parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VideoEffectExtra parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoEffectExtra parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static VideoEffectExtra parseFrom(C3430e c3430e) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoEffectExtra parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (VideoEffectExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
