package com.p051p1.mobile.longlink.msg.project;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C3430e;
import com.google.protobuf.C3433h;
import com.google.protobuf.C3437l;
import com.google.protobuf.C3441p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
import p153l.fig0;
import p153l.iig0;
import p153l.l710;
import p153l.lfz;
import p153l.ng60;

/* JADX INFO: loaded from: classes8.dex */
public final class LongLinkOmsDialogInfo {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo$1 */
    public static /* synthetic */ class C46971 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16715xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16715xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16715xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ConstraintOrBuilder extends lfz {
        int getCount();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        int getFrequency(int i);

        int getFrequencyCount();

        List<Integer> getFrequencyList();

        int getPriority();

        int getSessionCount();

        int getTimePerDay();

        long getTimeRange(int i);

        int getTimeRangeCount();

        List<Long> getTimeRangeList();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ContentOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        ByteString getMorph();

        Resource getTemplate();

        Web getWeb();

        boolean hasTemplate();

        boolean hasWeb();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface DialogOrBuilder extends lfz {
        boolean getBlockCard();

        boolean getCancelAble();

        Constraint getConstraint();

        Content getContent();

        String getContentType();

        ByteString getContentTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getIdentifier();

        ByteString getIdentifierBytes();

        Mercury getMercury();

        Position getPosition();

        boolean getRemote();

        int getVersion();

        boolean hasConstraint();

        boolean hasContent();

        boolean hasMercury();

        boolean hasPosition();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface DialogsOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Dialog getDialogs(int i);

        int getDialogsCount();

        List<Dialog> getDialogsList();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface LayoutOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getType();

        ByteString getTypeBytes();

        double getValue();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface MercuryOrBuilder extends lfz {
        boolean containsServer(String str);

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        @Deprecated
        Map<String, String> getServer();

        int getServerCount();

        Map<String, String> getServerMap();

        String getServerOrDefault(String str, String str2);

        String getServerOrThrow(String str);

        String getType();

        ByteString getTypeBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface NodeContentOrBuilder extends lfz {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getColor();

        ByteString getColorBytes();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getFont();

        ByteString getFontBytes();

        int getSize();

        boolean getStrikethrough();

        boolean getUnderline();

        String getUrl();

        ByteString getUrlBytes();

        String getValue();

        ByteString getValueBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface PositionOrBuilder extends lfz {
        String getContain(int i);

        ByteString getContainBytes(int i);

        int getContainCount();

        List<String> getContainList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getExclude(int i);

        ByteString getExcludeBytes(int i);

        int getExcludeCount();

        List<String> getExcludeList();

        String getId();

        ByteString getIdBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ResourceNodeOrBuilder extends lfz {
        String getColors(int i);

        ByteString getColorsBytes(int i);

        int getColorsCount();

        List<String> getColorsList();

        NodeContent getContents(int i);

        int getContentsCount();

        List<NodeContent> getContentsList();

        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getDirection();

        ByteString getDirectionBytes();

        String getIndex();

        ByteString getIndexBytes();

        Mercury getMercury();

        String getSrc();

        ByteString getSrcBytes();

        String getType();

        ByteString getTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasMercury();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ResourceOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        ResourcePage getPages(int i);

        int getPagesCount();

        List<ResourcePage> getPagesList();

        String getTemplateID();

        ByteString getTemplateIDBytes();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface ResourcePageOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        int getIndex();

        ResourceNode getNodes(int i);

        int getNodesCount();

        List<ResourceNode> getNodesList();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    public interface WebOrBuilder extends lfz {
        @Override // p153l.lfz
        /* synthetic */ InterfaceC3442q getDefaultInstanceForType();

        Layout getHeight();

        String getUrl();

        ByteString getUrlBytes();

        Layout getWidth();

        boolean hasHeight();

        boolean hasWidth();

        @Override // p153l.lfz
        /* synthetic */ boolean isInitialized();
    }

    private LongLinkOmsDialogInfo() {
    }

    public static void registerAllExtensions(C3433h c3433h) {
    }

    public static final class Constraint extends GeneratedMessageLite<Constraint, Builder> implements ConstraintOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final Constraint DEFAULT_INSTANCE;
        public static final int FREQUENCY_FIELD_NUMBER = 3;
        private static volatile ng60<Constraint> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 6;
        public static final int SESSIONCOUNT_FIELD_NUMBER = 2;
        public static final int TIMEPERDAY_FIELD_NUMBER = 5;
        public static final int TIMERANGE_FIELD_NUMBER = 4;
        private int bitField0_;
        private int count_;
        private int priority_;
        private int sessionCount_;
        private int timePerDay_;
        private C3437l.f frequency_ = GeneratedMessageLite.emptyIntList();
        private C3437l.g timeRange_ = GeneratedMessageLite.emptyLongList();

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Constraint, Builder> implements ConstraintOrBuilder {
            private Builder() {
                super(Constraint.DEFAULT_INSTANCE);
            }

            public Builder addAllFrequency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Constraint) this.instance).addAllFrequency(iterable);
                return this;
            }

            public Builder addAllTimeRange(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((Constraint) this.instance).addAllTimeRange(iterable);
                return this;
            }

            public Builder addFrequency(int i) {
                copyOnWrite();
                ((Constraint) this.instance).addFrequency(i);
                return this;
            }

            public Builder addTimeRange(long j) {
                copyOnWrite();
                ((Constraint) this.instance).addTimeRange(j);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((Constraint) this.instance).clearCount();
                return this;
            }

            public Builder clearFrequency() {
                copyOnWrite();
                ((Constraint) this.instance).clearFrequency();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((Constraint) this.instance).clearPriority();
                return this;
            }

            public Builder clearSessionCount() {
                copyOnWrite();
                ((Constraint) this.instance).clearSessionCount();
                return this;
            }

            public Builder clearTimePerDay() {
                copyOnWrite();
                ((Constraint) this.instance).clearTimePerDay();
                return this;
            }

            public Builder clearTimeRange() {
                copyOnWrite();
                ((Constraint) this.instance).clearTimeRange();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getCount() {
                return ((Constraint) this.instance).getCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getFrequency(int i) {
                return ((Constraint) this.instance).getFrequency(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getFrequencyCount() {
                return ((Constraint) this.instance).getFrequencyCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public List<Integer> getFrequencyList() {
                return Collections.unmodifiableList(((Constraint) this.instance).getFrequencyList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getPriority() {
                return ((Constraint) this.instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getSessionCount() {
                return ((Constraint) this.instance).getSessionCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getTimePerDay() {
                return ((Constraint) this.instance).getTimePerDay();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public long getTimeRange(int i) {
                return ((Constraint) this.instance).getTimeRange(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getTimeRangeCount() {
                return ((Constraint) this.instance).getTimeRangeCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public List<Long> getTimeRangeList() {
                return Collections.unmodifiableList(((Constraint) this.instance).getTimeRangeList());
            }

            public Builder setCount(int i) {
                copyOnWrite();
                ((Constraint) this.instance).setCount(i);
                return this;
            }

            public Builder setFrequency(int i, int i2) {
                copyOnWrite();
                ((Constraint) this.instance).setFrequency(i, i2);
                return this;
            }

            public Builder setPriority(int i) {
                copyOnWrite();
                ((Constraint) this.instance).setPriority(i);
                return this;
            }

            public Builder setSessionCount(int i) {
                copyOnWrite();
                ((Constraint) this.instance).setSessionCount(i);
                return this;
            }

            public Builder setTimePerDay(int i) {
                copyOnWrite();
                ((Constraint) this.instance).setTimePerDay(i);
                return this;
            }

            public Builder setTimeRange(int i, long j) {
                copyOnWrite();
                ((Constraint) this.instance).setTimeRange(i, j);
                return this;
            }
        }

        static {
            Constraint constraint = new Constraint();
            DEFAULT_INSTANCE = constraint;
            constraint.makeImmutable();
        }

        private Constraint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFrequency(Iterable<? extends Integer> iterable) {
            ensureFrequencyIsMutable();
            AbstractC3426a.addAll(iterable, this.frequency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTimeRange(Iterable<? extends Long> iterable) {
            ensureTimeRangeIsMutable();
            AbstractC3426a.addAll(iterable, this.timeRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFrequency(int i) {
            ensureFrequencyIsMutable();
            this.frequency_.mo17255U(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTimeRange(long j) {
            ensureTimeRangeIsMutable();
            this.timeRange_.mo17267u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrequency() {
            this.frequency_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCount() {
            this.sessionCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimePerDay() {
            this.timePerDay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeRange() {
            this.timeRange_ = GeneratedMessageLite.emptyLongList();
        }

        private void ensureFrequencyIsMutable() {
            if (this.frequency_.mo17140q()) {
                return;
            }
            this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
        }

        private void ensureTimeRangeIsMutable() {
            if (this.timeRange_.mo17140q()) {
                return;
            }
            this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
        }

        public static Constraint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Constraint constraint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(constraint);
        }

        public static Constraint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Constraint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Constraint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Constraint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i) {
            this.count_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrequency(int i, int i2) {
            ensureFrequencyIsMutable();
            this.frequency_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i) {
            this.priority_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCount(int i) {
            this.sessionCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimePerDay(int i) {
            this.timePerDay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeRange(int i, long j) {
            ensureTimeRangeIsMutable();
            this.timeRange_.setLong(i, j);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Constraint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.frequency_.mo17139n();
                    this.timeRange_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Constraint constraint = (Constraint) obj2;
                    int i = this.count_;
                    boolean z2 = i != 0;
                    int i2 = constraint.count_;
                    this.count_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    int i3 = this.sessionCount_;
                    boolean z3 = i3 != 0;
                    int i4 = constraint.sessionCount_;
                    this.sessionCount_ = interfaceC3409h.mo17051e(z3, i3, i4 != 0, i4);
                    this.frequency_ = interfaceC3409h.mo17060n(this.frequency_, constraint.frequency_);
                    this.timeRange_ = interfaceC3409h.mo17063q(this.timeRange_, constraint.timeRange_);
                    int i5 = this.timePerDay_;
                    boolean z4 = i5 != 0;
                    int i6 = constraint.timePerDay_;
                    this.timePerDay_ = interfaceC3409h.mo17051e(z4, i5, i6 != 0, i6);
                    int i7 = this.priority_;
                    boolean z5 = i7 != 0;
                    int i8 = constraint.priority_;
                    this.priority_ = interfaceC3409h.mo17051e(z5, i7, i8 != 0, i8);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= constraint.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.count_ = c3430e.m17196u();
                                } else if (iM17171M == 16) {
                                    this.sessionCount_ = c3430e.m17196u();
                                } else if (iM17171M == 24) {
                                    if (!this.frequency_.mo17140q()) {
                                        this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
                                    }
                                    this.frequency_.mo17255U(c3430e.m17196u());
                                } else if (iM17171M == 26) {
                                    int iM17187l = c3430e.m17187l(c3430e.m17162C());
                                    if (!this.frequency_.mo17140q() && c3430e.m17184d() > 0) {
                                        this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
                                    }
                                    while (c3430e.m17184d() > 0) {
                                        this.frequency_.mo17255U(c3430e.m17196u());
                                    }
                                    c3430e.m17186k(iM17187l);
                                } else if (iM17171M == 32) {
                                    if (!this.timeRange_.mo17140q()) {
                                        this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
                                    }
                                    this.timeRange_.mo17267u(c3430e.m17197v());
                                } else if (iM17171M == 34) {
                                    int iM17187l2 = c3430e.m17187l(c3430e.m17162C());
                                    if (!this.timeRange_.mo17140q() && c3430e.m17184d() > 0) {
                                        this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
                                    }
                                    while (c3430e.m17184d() > 0) {
                                        this.timeRange_.mo17267u(c3430e.m17197v());
                                    }
                                    c3430e.m17186k(iM17187l2);
                                } else if (iM17171M == 40) {
                                    this.timePerDay_ = c3430e.m17196u();
                                } else if (iM17171M == 48) {
                                    this.priority_ = c3430e.m17196u();
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
                        synchronized (Constraint.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getFrequency(int i) {
            return this.frequency_.getInt(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getFrequencyCount() {
            return this.frequency_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public List<Integer> getFrequencyList() {
            return this.frequency_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.count_;
            int iM16984t = i2 != 0 ? CodedOutputStream.m16984t(1, i2) : 0;
            int i3 = this.sessionCount_;
            if (i3 != 0) {
                iM16984t += CodedOutputStream.m16984t(2, i3);
            }
            int iM16985u = 0;
            for (int i4 = 0; i4 < this.frequency_.size(); i4++) {
                iM16985u += CodedOutputStream.m16985u(this.frequency_.getInt(i4));
            }
            int size = iM16984t + iM16985u + getFrequencyList().size();
            int iM16987w = 0;
            for (int i5 = 0; i5 < this.timeRange_.size(); i5++) {
                iM16987w += CodedOutputStream.m16987w(this.timeRange_.getLong(i5));
            }
            int size2 = size + iM16987w + getTimeRangeList().size();
            int i6 = this.timePerDay_;
            if (i6 != 0) {
                size2 += CodedOutputStream.m16984t(5, i6);
            }
            int i7 = this.priority_;
            if (i7 != 0) {
                size2 += CodedOutputStream.m16984t(6, i7);
            }
            this.memoizedSerializedSize = size2;
            return size2;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getSessionCount() {
            return this.sessionCount_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getTimePerDay() {
            return this.timePerDay_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public long getTimeRange(int i) {
            return this.timeRange_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getTimeRangeCount() {
            return this.timeRange_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public List<Long> getTimeRangeList() {
            return this.timeRange_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = this.count_;
            if (i != 0) {
                codedOutputStream.mo17025s0(1, i);
            }
            int i2 = this.sessionCount_;
            if (i2 != 0) {
                codedOutputStream.mo17025s0(2, i2);
            }
            for (int i3 = 0; i3 < this.frequency_.size(); i3++) {
                codedOutputStream.mo17025s0(3, this.frequency_.getInt(i3));
            }
            for (int i4 = 0; i4 < this.timeRange_.size(); i4++) {
                codedOutputStream.m17027u0(4, this.timeRange_.getLong(i4));
            }
            int i5 = this.timePerDay_;
            if (i5 != 0) {
                codedOutputStream.mo17025s0(5, i5);
            }
            int i6 = this.priority_;
            if (i6 != 0) {
                codedOutputStream.mo17025s0(6, i6);
            }
        }

        public static Constraint parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Constraint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Constraint parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Constraint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Constraint parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Constraint parseFrom(InputStream inputStream) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Constraint parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Constraint parseFrom(C3430e c3430e) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Constraint parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        private static final Content DEFAULT_INSTANCE;
        public static final int MORPH_FIELD_NUMBER = 3;
        private static volatile ng60<Content> PARSER = null;
        public static final int TEMPLATE_FIELD_NUMBER = 1;
        public static final int WEB_FIELD_NUMBER = 2;
        private ByteString morph_ = ByteString.EMPTY;
        private Resource template_;
        private Web web_;

        static {
            Content content = new Content();
            DEFAULT_INSTANCE = content;
            content.makeImmutable();
        }

        private Content() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMorph() {
            this.morph_ = getDefaultInstance().getMorph();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeb() {
            this.web_ = null;
        }

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Resource resource) {
            Resource resource2 = this.template_;
            if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
                this.template_ = resource;
            } else {
                this.template_ = Resource.newBuilder(this.template_).mergeFrom(resource).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWeb(Web web) {
            Web web2 = this.web_;
            if (web2 == null || web2 == Web.getDefaultInstance()) {
                this.web_ = web;
            } else {
                this.web_ = Web.newBuilder(this.web_).mergeFrom(web).buildPartial();
            }
        }

        public static Builder newBuilder(Content content) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(content);
        }

        public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMorph(ByteString byteString) {
            byteString.getClass();
            this.morph_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Resource.Builder builder) {
            this.template_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeb(Web.Builder builder) {
            this.web_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Content();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Content content = (Content) obj2;
                    this.template_ = (Resource) interfaceC3409h.mo17061o(this.template_, content.template_);
                    this.web_ = (Web) interfaceC3409h.mo17061o(this.web_, content.web_);
                    ByteString byteString = this.morph_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = content.morph_;
                    this.morph_ = interfaceC3409h.mo17054h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    Resource resource = this.template_;
                                    Resource.Builder builder = resource != null ? resource.toBuilder() : null;
                                    Resource resource2 = (Resource) c3430e.m17198w(Resource.parser(), c3433h);
                                    this.template_ = resource2;
                                    if (builder != null) {
                                        builder.mergeFrom(resource2);
                                        this.template_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 18) {
                                    Web web = this.web_;
                                    Web.Builder builder2 = web != null ? web.toBuilder() : null;
                                    Web web2 = (Web) c3430e.m17198w(Web.parser(), c3433h);
                                    this.web_ = web2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(web2);
                                        this.web_ = builder2.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    this.morph_ = c3430e.m17189n();
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
                        synchronized (Content.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public ByteString getMorph() {
            return this.morph_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = this.template_ != null ? CodedOutputStream.m16948C(1, getTemplate()) : 0;
            if (this.web_ != null) {
                iM16948C += CodedOutputStream.m16948C(2, getWeb());
            }
            if (!this.morph_.isEmpty()) {
                iM16948C += CodedOutputStream.m16973i(3, this.morph_);
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public Resource getTemplate() {
            Resource resource = this.template_;
            return resource == null ? Resource.getDefaultInstance() : resource;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public Web getWeb() {
            Web web = this.web_;
            return web == null ? Web.getDefaultInstance() : web;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public boolean hasWeb() {
            return this.web_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.mo17029w0(1, getTemplate());
            }
            if (this.web_ != null) {
                codedOutputStream.mo17029w0(2, getWeb());
            }
            if (this.morph_.isEmpty()) {
                return;
            }
            codedOutputStream.mo17011e0(3, this.morph_);
        }

        public static Content parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Content parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Resource resource) {
            resource.getClass();
            this.template_ = resource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeb(Web web) {
            web.getClass();
            this.web_ = web;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Content, Builder> implements ContentOrBuilder {
            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }

            public Builder clearMorph() {
                copyOnWrite();
                ((Content) this.instance).clearMorph();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((Content) this.instance).clearTemplate();
                return this;
            }

            public Builder clearWeb() {
                copyOnWrite();
                ((Content) this.instance).clearWeb();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public ByteString getMorph() {
                return ((Content) this.instance).getMorph();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public Resource getTemplate() {
                return ((Content) this.instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public Web getWeb() {
                return ((Content) this.instance).getWeb();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public boolean hasTemplate() {
                return ((Content) this.instance).hasTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public boolean hasWeb() {
                return ((Content) this.instance).hasWeb();
            }

            public Builder mergeTemplate(Resource resource) {
                copyOnWrite();
                ((Content) this.instance).mergeTemplate(resource);
                return this;
            }

            public Builder mergeWeb(Web web) {
                copyOnWrite();
                ((Content) this.instance).mergeWeb(web);
                return this;
            }

            public Builder setMorph(ByteString byteString) {
                copyOnWrite();
                ((Content) this.instance).setMorph(byteString);
                return this;
            }

            public Builder setTemplate(Resource resource) {
                copyOnWrite();
                ((Content) this.instance).setTemplate(resource);
                return this;
            }

            public Builder setWeb(Web web) {
                copyOnWrite();
                ((Content) this.instance).setWeb(web);
                return this;
            }

            public Builder setTemplate(Resource.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setTemplate(builder);
                return this;
            }

            public Builder setWeb(Web.Builder builder) {
                copyOnWrite();
                ((Content) this.instance).setWeb(builder);
                return this;
            }
        }

        public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Content parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Content parseFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Content parseFrom(C3430e c3430e) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Content parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Dialog extends GeneratedMessageLite<Dialog, Builder> implements DialogOrBuilder {
        public static final int BLOCKCARD_FIELD_NUMBER = 6;
        public static final int CANCELABLE_FIELD_NUMBER = 5;
        public static final int CONSTRAINT_FIELD_NUMBER = 7;
        public static final int CONTENTTYPE_FIELD_NUMBER = 10;
        public static final int CONTENT_FIELD_NUMBER = 11;
        private static final Dialog DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MERCURY_FIELD_NUMBER = 9;
        private static volatile ng60<Dialog> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 8;
        public static final int REMOTE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 3;
        private boolean blockCard_;
        private boolean cancelAble_;
        private Constraint constraint_;
        private Content content_;
        private Mercury mercury_;
        private Position position_;
        private boolean remote_;
        private int version_;
        private String id_ = "";
        private String identifier_ = "";
        private String contentType_ = "";

        static {
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            dialog.makeImmutable();
        }

        private Dialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockCard() {
            this.blockCard_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCancelAble() {
            this.cancelAble_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConstraint() {
            this.constraint_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentType() {
            this.contentType_ = getDefaultInstance().getContentType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMercury() {
            this.mercury_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemote() {
            this.remote_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static Dialog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConstraint(Constraint constraint) {
            Constraint constraint2 = this.constraint_;
            if (constraint2 == null || constraint2 == Constraint.getDefaultInstance()) {
                this.constraint_ = constraint;
            } else {
                this.constraint_ = Constraint.newBuilder(this.constraint_).mergeFrom(constraint).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContent(Content content) {
            Content content2 = this.content_;
            if (content2 == null || content2 == Content.getDefaultInstance()) {
                this.content_ = content;
            } else {
                this.content_ = Content.newBuilder(this.content_).mergeFrom(content).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMercury(Mercury mercury) {
            Mercury mercury2 = this.mercury_;
            if (mercury2 == null || mercury2 == Mercury.getDefaultInstance()) {
                this.mercury_ = mercury;
            } else {
                this.mercury_ = Mercury.newBuilder(this.mercury_).mergeFrom(mercury).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePosition(Position position) {
            Position position2 = this.position_;
            if (position2 == null || position2 == Position.getDefaultInstance()) {
                this.position_ = position;
            } else {
                this.position_ = Position.newBuilder(this.position_).mergeFrom(position).buildPartial();
            }
        }

        public static Builder newBuilder(Dialog dialog) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dialog);
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Dialog> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockCard(boolean z) {
            this.blockCard_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCancelAble(boolean z) {
            this.cancelAble_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConstraint(Constraint.Builder builder) {
            this.constraint_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(Content.Builder builder) {
            this.content_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentType(String str) {
            str.getClass();
            this.contentType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.contentType_ = byteString.toStringUtf8();
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
        public void setIdentifier(String str) {
            str.getClass();
            this.identifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.identifier_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury.Builder builder) {
            this.mercury_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position.Builder builder) {
            this.position_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemote(boolean z) {
            this.remote_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dialog();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Dialog dialog = (Dialog) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !dialog.id_.isEmpty(), dialog.id_);
                    this.identifier_ = interfaceC3409h.mo17052f(!this.identifier_.isEmpty(), this.identifier_, !dialog.identifier_.isEmpty(), dialog.identifier_);
                    int i = this.version_;
                    boolean z2 = i != 0;
                    int i2 = dialog.version_;
                    this.version_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    boolean z3 = this.remote_;
                    boolean z4 = dialog.remote_;
                    this.remote_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    boolean z5 = this.cancelAble_;
                    boolean z6 = dialog.cancelAble_;
                    this.cancelAble_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    boolean z7 = this.blockCard_;
                    boolean z8 = dialog.blockCard_;
                    this.blockCard_ = interfaceC3409h.mo17050d(z7, z7, z8, z8);
                    this.constraint_ = (Constraint) interfaceC3409h.mo17061o(this.constraint_, dialog.constraint_);
                    this.position_ = (Position) interfaceC3409h.mo17061o(this.position_, dialog.position_);
                    this.mercury_ = (Mercury) interfaceC3409h.mo17061o(this.mercury_, dialog.mercury_);
                    this.contentType_ = interfaceC3409h.mo17052f(!this.contentType_.isEmpty(), this.contentType_, !dialog.contentType_.isEmpty(), dialog.contentType_);
                    this.content_ = (Content) interfaceC3409h.mo17061o(this.content_, dialog.content_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
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
                                    this.id_ = c3430e.m17170L();
                                    continue;
                                case 18:
                                    this.identifier_ = c3430e.m17170L();
                                    continue;
                                case 24:
                                    this.version_ = c3430e.m17196u();
                                    continue;
                                case 32:
                                    this.remote_ = c3430e.m17188m();
                                    continue;
                                case 40:
                                    this.cancelAble_ = c3430e.m17188m();
                                    continue;
                                case 48:
                                    this.blockCard_ = c3430e.m17188m();
                                    continue;
                                case 58:
                                    Constraint constraint = this.constraint_;
                                    Constraint.Builder builder = constraint != null ? constraint.toBuilder() : null;
                                    Constraint constraint2 = (Constraint) c3430e.m17198w(Constraint.parser(), c3433h);
                                    this.constraint_ = constraint2;
                                    if (builder != null) {
                                        builder.mergeFrom(constraint2);
                                        this.constraint_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 66:
                                    Position position = this.position_;
                                    Position.Builder builder2 = position != null ? position.toBuilder() : null;
                                    Position position2 = (Position) c3430e.m17198w(Position.parser(), c3433h);
                                    this.position_ = position2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(position2);
                                        this.position_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    Mercury mercury = this.mercury_;
                                    Mercury.Builder builder3 = mercury != null ? mercury.toBuilder() : null;
                                    Mercury mercury2 = (Mercury) c3430e.m17198w(Mercury.parser(), c3433h);
                                    this.mercury_ = mercury2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(mercury2);
                                        this.mercury_ = builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                                    this.contentType_ = c3430e.m17170L();
                                    continue;
                                case 90:
                                    Content content = this.content_;
                                    Content.Builder builder4 = content != null ? content.toBuilder() : null;
                                    Content content2 = (Content) c3430e.m17198w(Content.parser(), c3433h);
                                    this.content_ = content2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(content2);
                                        this.content_ = builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
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
                        synchronized (Dialog.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getBlockCard() {
            return this.blockCard_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getCancelAble() {
            return this.cancelAble_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Constraint getConstraint() {
            Constraint constraint = this.constraint_;
            return constraint == null ? Constraint.getDefaultInstance() : constraint;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getContentType() {
            return this.contentType_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getContentTypeBytes() {
            return ByteString.copyFromUtf8(this.contentType_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getIdentifier() {
            return this.identifier_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getIdentifierBytes() {
            return ByteString.copyFromUtf8(this.identifier_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Mercury getMercury() {
            Mercury mercury = this.mercury_;
            return mercury == null ? Mercury.getDefaultInstance() : mercury;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Position getPosition() {
            Position position = this.position_;
            return position == null ? Position.getDefaultInstance() : position;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getRemote() {
            return this.remote_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.identifier_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getIdentifier());
            }
            int i2 = this.version_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(3, i2);
            }
            boolean z = this.remote_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(4, z);
            }
            boolean z2 = this.cancelAble_;
            if (z2) {
                iM16956K += CodedOutputStream.m16970f(5, z2);
            }
            boolean z3 = this.blockCard_;
            if (z3) {
                iM16956K += CodedOutputStream.m16970f(6, z3);
            }
            if (this.constraint_ != null) {
                iM16956K += CodedOutputStream.m16948C(7, getConstraint());
            }
            if (this.position_ != null) {
                iM16956K += CodedOutputStream.m16948C(8, getPosition());
            }
            if (this.mercury_ != null) {
                iM16956K += CodedOutputStream.m16948C(9, getMercury());
            }
            if (!this.contentType_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(10, getContentType());
            }
            if (this.content_ != null) {
                iM16956K += CodedOutputStream.m16948C(11, getContent());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasConstraint() {
            return this.constraint_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasMercury() {
            return this.mercury_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasPosition() {
            return this.position_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.identifier_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getIdentifier());
            }
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.mo17025s0(3, i);
            }
            boolean z = this.remote_;
            if (z) {
                codedOutputStream.mo17005a0(4, z);
            }
            boolean z2 = this.cancelAble_;
            if (z2) {
                codedOutputStream.mo17005a0(5, z2);
            }
            boolean z3 = this.blockCard_;
            if (z3) {
                codedOutputStream.mo17005a0(6, z3);
            }
            if (this.constraint_ != null) {
                codedOutputStream.mo17029w0(7, getConstraint());
            }
            if (this.position_ != null) {
                codedOutputStream.mo17029w0(8, getPosition());
            }
            if (this.mercury_ != null) {
                codedOutputStream.mo17029w0(9, getMercury());
            }
            if (!this.contentType_.isEmpty()) {
                codedOutputStream.mo16994D0(10, getContentType());
            }
            if (this.content_ != null) {
                codedOutputStream.mo17029w0(11, getContent());
            }
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Dialog parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConstraint(Constraint constraint) {
            constraint.getClass();
            this.constraint_ = constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(Content content) {
            content.getClass();
            this.content_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury mercury) {
            mercury.getClass();
            this.mercury_ = mercury;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position position) {
            position.getClass();
            this.position_ = position;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Dialog, Builder> implements DialogOrBuilder {
            private Builder() {
                super(Dialog.DEFAULT_INSTANCE);
            }

            public Builder clearBlockCard() {
                copyOnWrite();
                ((Dialog) this.instance).clearBlockCard();
                return this;
            }

            public Builder clearCancelAble() {
                copyOnWrite();
                ((Dialog) this.instance).clearCancelAble();
                return this;
            }

            public Builder clearConstraint() {
                copyOnWrite();
                ((Dialog) this.instance).clearConstraint();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((Dialog) this.instance).clearContent();
                return this;
            }

            public Builder clearContentType() {
                copyOnWrite();
                ((Dialog) this.instance).clearContentType();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Dialog) this.instance).clearId();
                return this;
            }

            public Builder clearIdentifier() {
                copyOnWrite();
                ((Dialog) this.instance).clearIdentifier();
                return this;
            }

            public Builder clearMercury() {
                copyOnWrite();
                ((Dialog) this.instance).clearMercury();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((Dialog) this.instance).clearPosition();
                return this;
            }

            public Builder clearRemote() {
                copyOnWrite();
                ((Dialog) this.instance).clearRemote();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Dialog) this.instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getBlockCard() {
                return ((Dialog) this.instance).getBlockCard();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getCancelAble() {
                return ((Dialog) this.instance).getCancelAble();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Constraint getConstraint() {
                return ((Dialog) this.instance).getConstraint();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Content getContent() {
                return ((Dialog) this.instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getContentType() {
                return ((Dialog) this.instance).getContentType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getContentTypeBytes() {
                return ((Dialog) this.instance).getContentTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getId() {
                return ((Dialog) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getIdBytes() {
                return ((Dialog) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getIdentifier() {
                return ((Dialog) this.instance).getIdentifier();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getIdentifierBytes() {
                return ((Dialog) this.instance).getIdentifierBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Mercury getMercury() {
                return ((Dialog) this.instance).getMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Position getPosition() {
                return ((Dialog) this.instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getRemote() {
                return ((Dialog) this.instance).getRemote();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public int getVersion() {
                return ((Dialog) this.instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasConstraint() {
                return ((Dialog) this.instance).hasConstraint();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasContent() {
                return ((Dialog) this.instance).hasContent();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasMercury() {
                return ((Dialog) this.instance).hasMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasPosition() {
                return ((Dialog) this.instance).hasPosition();
            }

            public Builder mergeConstraint(Constraint constraint) {
                copyOnWrite();
                ((Dialog) this.instance).mergeConstraint(constraint);
                return this;
            }

            public Builder mergeContent(Content content) {
                copyOnWrite();
                ((Dialog) this.instance).mergeContent(content);
                return this;
            }

            public Builder mergeMercury(Mercury mercury) {
                copyOnWrite();
                ((Dialog) this.instance).mergeMercury(mercury);
                return this;
            }

            public Builder mergePosition(Position position) {
                copyOnWrite();
                ((Dialog) this.instance).mergePosition(position);
                return this;
            }

            public Builder setBlockCard(boolean z) {
                copyOnWrite();
                ((Dialog) this.instance).setBlockCard(z);
                return this;
            }

            public Builder setCancelAble(boolean z) {
                copyOnWrite();
                ((Dialog) this.instance).setCancelAble(z);
                return this;
            }

            public Builder setConstraint(Constraint constraint) {
                copyOnWrite();
                ((Dialog) this.instance).setConstraint(constraint);
                return this;
            }

            public Builder setContent(Content content) {
                copyOnWrite();
                ((Dialog) this.instance).setContent(content);
                return this;
            }

            public Builder setContentType(String str) {
                copyOnWrite();
                ((Dialog) this.instance).setContentType(str);
                return this;
            }

            public Builder setContentTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) this.instance).setContentTypeBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Dialog) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setIdentifier(String str) {
                copyOnWrite();
                ((Dialog) this.instance).setIdentifier(str);
                return this;
            }

            public Builder setIdentifierBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) this.instance).setIdentifierBytes(byteString);
                return this;
            }

            public Builder setMercury(Mercury mercury) {
                copyOnWrite();
                ((Dialog) this.instance).setMercury(mercury);
                return this;
            }

            public Builder setPosition(Position position) {
                copyOnWrite();
                ((Dialog) this.instance).setPosition(position);
                return this;
            }

            public Builder setRemote(boolean z) {
                copyOnWrite();
                ((Dialog) this.instance).setRemote(z);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((Dialog) this.instance).setVersion(i);
                return this;
            }

            public Builder setConstraint(Constraint.Builder builder) {
                copyOnWrite();
                ((Dialog) this.instance).setConstraint(builder);
                return this;
            }

            public Builder setContent(Content.Builder builder) {
                copyOnWrite();
                ((Dialog) this.instance).setContent(builder);
                return this;
            }

            public Builder setMercury(Mercury.Builder builder) {
                copyOnWrite();
                ((Dialog) this.instance).setMercury(builder);
                return this;
            }

            public Builder setPosition(Position.Builder builder) {
                copyOnWrite();
                ((Dialog) this.instance).setPosition(builder);
                return this;
            }
        }

        public static Dialog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialog parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Dialog parseFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Dialog parseFrom(C3430e c3430e) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Dialog parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Dialogs extends GeneratedMessageLite<Dialogs, Builder> implements DialogsOrBuilder {
        private static final Dialogs DEFAULT_INSTANCE;
        public static final int DIALOGS_FIELD_NUMBER = 1;
        private static volatile ng60<Dialogs> PARSER;
        private C3437l.h<Dialog> dialogs_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Dialogs dialogs = new Dialogs();
            DEFAULT_INSTANCE = dialogs;
            dialogs.makeImmutable();
        }

        private Dialogs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDialogs(Iterable<? extends Dialog> iterable) {
            ensureDialogsIsMutable();
            AbstractC3426a.addAll(iterable, this.dialogs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialogs() {
            this.dialogs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDialogsIsMutable() {
            if (this.dialogs_.mo17140q()) {
                return;
            }
            this.dialogs_ = GeneratedMessageLite.mutableCopy(this.dialogs_);
        }

        public static Dialogs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Dialogs dialogs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dialogs);
        }

        public static Dialogs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialogs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Dialogs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDialogs(int i) {
            ensureDialogsIsMutable();
            this.dialogs_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialogs(int i, Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dialogs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.dialogs_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.dialogs_ = ((GeneratedMessageLite.InterfaceC3409h) obj).mo17053g(this.dialogs_, ((Dialogs) obj2).dialogs_);
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
                                    if (!this.dialogs_.mo17140q()) {
                                        this.dialogs_ = GeneratedMessageLite.mutableCopy(this.dialogs_);
                                    }
                                    this.dialogs_.add((Dialog) c3430e.m17198w(Dialog.parser(), c3433h));
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
                        synchronized (Dialogs.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public Dialog getDialogs(int i) {
            return this.dialogs_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public int getDialogsCount() {
            return this.dialogs_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public List<Dialog> getDialogsList() {
            return this.dialogs_;
        }

        public DialogOrBuilder getDialogsOrBuilder(int i) {
            return this.dialogs_.get(i);
        }

        public List<? extends DialogOrBuilder> getDialogsOrBuilderList() {
            return this.dialogs_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16948C = 0;
            for (int i2 = 0; i2 < this.dialogs_.size(); i2++) {
                iM16948C += CodedOutputStream.m16948C(1, this.dialogs_.get(i2));
            }
            this.memoizedSerializedSize = iM16948C;
            return iM16948C;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.dialogs_.size(); i++) {
                codedOutputStream.mo17029w0(1, this.dialogs_.get(i));
            }
        }

        public static Dialogs parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Dialogs parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Dialogs, Builder> implements DialogsOrBuilder {
            private Builder() {
                super(Dialogs.DEFAULT_INSTANCE);
            }

            public Builder addAllDialogs(Iterable<? extends Dialog> iterable) {
                copyOnWrite();
                ((Dialogs) this.instance).addAllDialogs(iterable);
                return this;
            }

            public Builder addDialogs(Dialog dialog) {
                copyOnWrite();
                ((Dialogs) this.instance).addDialogs(dialog);
                return this;
            }

            public Builder clearDialogs() {
                copyOnWrite();
                ((Dialogs) this.instance).clearDialogs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public Dialog getDialogs(int i) {
                return ((Dialogs) this.instance).getDialogs(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public int getDialogsCount() {
                return ((Dialogs) this.instance).getDialogsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public List<Dialog> getDialogsList() {
                return Collections.unmodifiableList(((Dialogs) this.instance).getDialogsList());
            }

            public Builder removeDialogs(int i) {
                copyOnWrite();
                ((Dialogs) this.instance).removeDialogs(i);
                return this;
            }

            public Builder setDialogs(int i, Dialog dialog) {
                copyOnWrite();
                ((Dialogs) this.instance).setDialogs(i, dialog);
                return this;
            }

            public Builder addDialogs(int i, Dialog dialog) {
                copyOnWrite();
                ((Dialogs) this.instance).addDialogs(i, dialog);
                return this;
            }

            public Builder setDialogs(int i, Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) this.instance).setDialogs(i, builder);
                return this;
            }

            public Builder addDialogs(Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) this.instance).addDialogs(builder);
                return this;
            }

            public Builder addDialogs(int i, Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) this.instance).addDialogs(i, builder);
                return this;
            }
        }

        public static Dialogs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialogs parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Dialogs parseFrom(InputStream inputStream) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialogs parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Dialogs parseFrom(C3430e c3430e) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(int i, Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.add(i, dialog);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Dialogs parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialogs(int i, Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.set(i, dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.add(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(int i, Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.add(i, builder.build());
        }
    }

    public static final class Layout extends GeneratedMessageLite<Layout, Builder> implements LayoutOrBuilder {
        private static final Layout DEFAULT_INSTANCE;
        private static volatile ng60<Layout> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String type_ = "";
        private double value_;

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Layout, Builder> implements LayoutOrBuilder {
            private Builder() {
                super(Layout.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((Layout) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Layout) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public String getType() {
                return ((Layout) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public ByteString getTypeBytes() {
                return ((Layout) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public double getValue() {
                return ((Layout) this.instance).getValue();
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Layout) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Layout) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setValue(double d) {
                copyOnWrite();
                ((Layout) this.instance).setValue(d);
                return this;
            }
        }

        static {
            Layout layout = new Layout();
            DEFAULT_INSTANCE = layout;
            layout.makeImmutable();
        }

        private Layout() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        public static Layout getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Layout layout) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(layout);
        }

        public static Layout parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Layout parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Layout> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Layout();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Layout layout = (Layout) obj2;
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, !layout.type_.isEmpty(), layout.type_);
                    double d = this.value_;
                    boolean z2 = d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    double d2 = layout.value_;
                    this.value_ = interfaceC3409h.mo17056j(z2, d, d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d2);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.type_ = c3430e.m17170L();
                                } else if (iM17171M == 17) {
                                    this.value_ = c3430e.m17190o();
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
                        synchronized (Layout.class) {
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
            int iM16956K = !this.type_.isEmpty() ? CodedOutputStream.m16956K(1, getType()) : 0;
            double d = this.value_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                iM16956K += CodedOutputStream.m16975k(2, d);
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getType());
            }
            double d = this.value_;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                codedOutputStream.m17013g0(2, d);
            }
        }

        public static Layout parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Layout parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Layout parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Layout parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Layout parseFrom(InputStream inputStream) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Layout parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Layout parseFrom(C3430e c3430e) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Layout parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Mercury extends GeneratedMessageLite<Mercury, Builder> implements MercuryOrBuilder {
        private static final Mercury DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<Mercury> PARSER = null;
        public static final int SERVER_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private MapFieldLite<String, String> server_ = MapFieldLite.emptyMapField();
        private String id_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Mercury, Builder> implements MercuryOrBuilder {
            private Builder() {
                super(Mercury.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((Mercury) this.instance).clearId();
                return this;
            }

            public Builder clearServer() {
                copyOnWrite();
                ((Mercury) this.instance).getMutableServerMap().clear();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Mercury) this.instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public boolean containsServer(String str) {
                str.getClass();
                return ((Mercury) this.instance).getServerMap().containsKey(str);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getId() {
                return ((Mercury) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public ByteString getIdBytes() {
                return ((Mercury) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            @Deprecated
            public Map<String, String> getServer() {
                return getServerMap();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public int getServerCount() {
                return ((Mercury) this.instance).getServerMap().size();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public Map<String, String> getServerMap() {
                return Collections.unmodifiableMap(((Mercury) this.instance).getServerMap());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getServerOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> serverMap = ((Mercury) this.instance).getServerMap();
                return serverMap.containsKey(str) ? serverMap.get(str) : str2;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getServerOrThrow(String str) {
                str.getClass();
                Map<String, String> serverMap = ((Mercury) this.instance).getServerMap();
                if (serverMap.containsKey(str)) {
                    return serverMap.get(str);
                }
                fig0.m125680a();
                return null;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getType() {
                return ((Mercury) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public ByteString getTypeBytes() {
                return ((Mercury) this.instance).getTypeBytes();
            }

            public Builder putAllServer(Map<String, String> map) {
                copyOnWrite();
                ((Mercury) this.instance).getMutableServerMap().putAll(map);
                return this;
            }

            public Builder putServer(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Mercury) this.instance).getMutableServerMap().put(str, str2);
                return this;
            }

            public Builder removeServer(String str) {
                str.getClass();
                copyOnWrite();
                ((Mercury) this.instance).getMutableServerMap().remove(str);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Mercury) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Mercury) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Mercury) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Mercury) this.instance).setTypeBytes(byteString);
                return this;
            }
        }

        public static final class ServerDefaultEntryHolder {
            static final C3441p<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = C3441p.m17331c(fieldType, "", fieldType, "");
            }

            private ServerDefaultEntryHolder() {
            }
        }

        static {
            Mercury mercury = new Mercury();
            DEFAULT_INSTANCE = mercury;
            mercury.makeImmutable();
        }

        private Mercury() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Mercury getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableServerMap() {
            return internalGetMutableServer();
        }

        private MapFieldLite<String, String> internalGetMutableServer() {
            if (!this.server_.isMutable()) {
                this.server_ = this.server_.mutableCopy();
            }
            return this.server_;
        }

        private MapFieldLite<String, String> internalGetServer() {
            return this.server_;
        }

        public static Builder newBuilder(Mercury mercury) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mercury);
        }

        public static Mercury parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Mercury) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mercury parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Mercury> parser() {
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
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public boolean containsServer(String str) {
            str.getClass();
            return internalGetServer().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Mercury();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.server_.makeImmutable();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Mercury mercury = (Mercury) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !mercury.id_.isEmpty(), mercury.id_);
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, true ^ mercury.type_.isEmpty(), mercury.type_);
                    this.server_ = interfaceC3409h.mo17058l(this.server_, mercury.internalGetServer());
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= mercury.bitField0_;
                    }
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
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.type_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    if (!this.server_.isMutable()) {
                                        this.server_ = this.server_.mutableCopy();
                                    }
                                    ServerDefaultEntryHolder.defaultEntry.m17335e(this.server_, c3430e, c3433h);
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
                        synchronized (Mercury.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
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
            if (!this.type_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getType());
            }
            for (Map.Entry<String, String> entry : internalGetServer().entrySet()) {
                iM16956K += ServerDefaultEntryHolder.defaultEntry.m17334a(3, entry.getKey(), entry.getValue());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        @Deprecated
        public Map<String, String> getServer() {
            return getServerMap();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public int getServerCount() {
            return internalGetServer().size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public Map<String, String> getServerMap() {
            return Collections.unmodifiableMap(internalGetServer());
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getServerOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetServer = internalGetServer();
            return mapFieldLiteInternalGetServer.containsKey(str) ? mapFieldLiteInternalGetServer.get(str) : str2;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getServerOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetServer = internalGetServer();
            if (mapFieldLiteInternalGetServer.containsKey(str)) {
                return mapFieldLiteInternalGetServer.get(str);
            }
            fig0.m125680a();
            return null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getType());
            }
            for (Map.Entry<String, String> entry : internalGetServer().entrySet()) {
                ServerDefaultEntryHolder.defaultEntry.m17336f(codedOutputStream, 3, entry.getKey(), entry.getValue());
            }
        }

        public static Mercury parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Mercury) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Mercury parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Mercury parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Mercury parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Mercury parseFrom(InputStream inputStream) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mercury parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Mercury parseFrom(C3430e c3430e) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Mercury parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class NodeContent extends GeneratedMessageLite<NodeContent, Builder> implements NodeContentOrBuilder {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 5;
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final NodeContent DEFAULT_INSTANCE;
        public static final int FONT_FIELD_NUMBER = 4;
        private static volatile ng60<NodeContent> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int STRIKETHROUGH_FIELD_NUMBER = 6;
        public static final int UNDERLINE_FIELD_NUMBER = 7;
        public static final int URL_FIELD_NUMBER = 8;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int size_;
        private boolean strikethrough_;
        private boolean underline_;
        private String value_ = "";
        private String color_ = "";
        private String font_ = "";
        private String backgroundColor_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<NodeContent, Builder> implements NodeContentOrBuilder {
            private Builder() {
                super(NodeContent.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((NodeContent) this.instance).clearBackgroundColor();
                return this;
            }

            public Builder clearColor() {
                copyOnWrite();
                ((NodeContent) this.instance).clearColor();
                return this;
            }

            public Builder clearFont() {
                copyOnWrite();
                ((NodeContent) this.instance).clearFont();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((NodeContent) this.instance).clearSize();
                return this;
            }

            public Builder clearStrikethrough() {
                copyOnWrite();
                ((NodeContent) this.instance).clearStrikethrough();
                return this;
            }

            public Builder clearUnderline() {
                copyOnWrite();
                ((NodeContent) this.instance).clearUnderline();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((NodeContent) this.instance).clearUrl();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((NodeContent) this.instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getBackgroundColor() {
                return ((NodeContent) this.instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((NodeContent) this.instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getColor() {
                return ((NodeContent) this.instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getColorBytes() {
                return ((NodeContent) this.instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getFont() {
                return ((NodeContent) this.instance).getFont();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getFontBytes() {
                return ((NodeContent) this.instance).getFontBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public int getSize() {
                return ((NodeContent) this.instance).getSize();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public boolean getStrikethrough() {
                return ((NodeContent) this.instance).getStrikethrough();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public boolean getUnderline() {
                return ((NodeContent) this.instance).getUnderline();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getUrl() {
                return ((NodeContent) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getUrlBytes() {
                return ((NodeContent) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getValue() {
                return ((NodeContent) this.instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getValueBytes() {
                return ((NodeContent) this.instance).getValueBytes();
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((NodeContent) this.instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) this.instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((NodeContent) this.instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) this.instance).setColorBytes(byteString);
                return this;
            }

            public Builder setFont(String str) {
                copyOnWrite();
                ((NodeContent) this.instance).setFont(str);
                return this;
            }

            public Builder setFontBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) this.instance).setFontBytes(byteString);
                return this;
            }

            public Builder setSize(int i) {
                copyOnWrite();
                ((NodeContent) this.instance).setSize(i);
                return this;
            }

            public Builder setStrikethrough(boolean z) {
                copyOnWrite();
                ((NodeContent) this.instance).setStrikethrough(z);
                return this;
            }

            public Builder setUnderline(boolean z) {
                copyOnWrite();
                ((NodeContent) this.instance).setUnderline(z);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((NodeContent) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((NodeContent) this.instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) this.instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            NodeContent nodeContent = new NodeContent();
            DEFAULT_INSTANCE = nodeContent;
            nodeContent.makeImmutable();
        }

        private NodeContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColor() {
            this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFont() {
            this.font_ = getDefaultInstance().getFont();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrikethrough() {
            this.strikethrough_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnderline() {
            this.underline_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static NodeContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(NodeContent nodeContent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nodeContent);
        }

        public static NodeContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NodeContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<NodeContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(String str) {
            str.getClass();
            this.backgroundColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.backgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFont(String str) {
            str.getClass();
            this.font_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFontBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.font_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(int i) {
            this.size_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrikethrough(boolean z) {
            this.strikethrough_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnderline(boolean z) {
            this.underline_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
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
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NodeContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    NodeContent nodeContent = (NodeContent) obj2;
                    this.value_ = interfaceC3409h.mo17052f(!this.value_.isEmpty(), this.value_, !nodeContent.value_.isEmpty(), nodeContent.value_);
                    this.color_ = interfaceC3409h.mo17052f(!this.color_.isEmpty(), this.color_, !nodeContent.color_.isEmpty(), nodeContent.color_);
                    int i = this.size_;
                    boolean z2 = i != 0;
                    int i2 = nodeContent.size_;
                    this.size_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.font_ = interfaceC3409h.mo17052f(!this.font_.isEmpty(), this.font_, !nodeContent.font_.isEmpty(), nodeContent.font_);
                    this.backgroundColor_ = interfaceC3409h.mo17052f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, !nodeContent.backgroundColor_.isEmpty(), nodeContent.backgroundColor_);
                    boolean z3 = this.strikethrough_;
                    boolean z4 = nodeContent.strikethrough_;
                    this.strikethrough_ = interfaceC3409h.mo17050d(z3, z3, z4, z4);
                    boolean z5 = this.underline_;
                    boolean z6 = nodeContent.underline_;
                    this.underline_ = interfaceC3409h.mo17050d(z5, z5, z6, z6);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !nodeContent.url_.isEmpty(), nodeContent.url_);
                    GeneratedMessageLite.C3408g c3408g = GeneratedMessageLite.C3408g.INSTANCE;
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.value_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.color_ = c3430e.m17170L();
                                } else if (iM17171M == 24) {
                                    this.size_ = c3430e.m17196u();
                                } else if (iM17171M == 34) {
                                    this.font_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.backgroundColor_ = c3430e.m17170L();
                                } else if (iM17171M == 48) {
                                    this.strikethrough_ = c3430e.m17188m();
                                } else if (iM17171M == 56) {
                                    this.underline_ = c3430e.m17188m();
                                } else if (iM17171M == 66) {
                                    this.url_ = c3430e.m17170L();
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
                        synchronized (NodeContent.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundColor_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getFont() {
            return this.font_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getFontBytes() {
            return ByteString.copyFromUtf8(this.font_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.value_.isEmpty() ? CodedOutputStream.m16956K(1, getValue()) : 0;
            if (!this.color_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getColor());
            }
            int i2 = this.size_;
            if (i2 != 0) {
                iM16956K += CodedOutputStream.m16984t(3, i2);
            }
            if (!this.font_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(4, getFont());
            }
            if (!this.backgroundColor_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getBackgroundColor());
            }
            boolean z = this.strikethrough_;
            if (z) {
                iM16956K += CodedOutputStream.m16970f(6, z);
            }
            boolean z2 = this.underline_;
            if (z2) {
                iM16956K += CodedOutputStream.m16970f(7, z2);
            }
            if (!this.url_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(8, getUrl());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public boolean getStrikethrough() {
            return this.strikethrough_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public boolean getUnderline() {
            return this.underline_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.value_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getValue());
            }
            if (!this.color_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getColor());
            }
            int i = this.size_;
            if (i != 0) {
                codedOutputStream.mo17025s0(3, i);
            }
            if (!this.font_.isEmpty()) {
                codedOutputStream.mo16994D0(4, getFont());
            }
            if (!this.backgroundColor_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getBackgroundColor());
            }
            boolean z = this.strikethrough_;
            if (z) {
                codedOutputStream.mo17005a0(6, z);
            }
            boolean z2 = this.underline_;
            if (z2) {
                codedOutputStream.mo17005a0(7, z2);
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.mo16994D0(8, getUrl());
        }

        public static NodeContent parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static NodeContent parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static NodeContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NodeContent parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static NodeContent parseFrom(InputStream inputStream) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NodeContent parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static NodeContent parseFrom(C3430e c3430e) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NodeContent parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Position extends GeneratedMessageLite<Position, Builder> implements PositionOrBuilder {
        public static final int CONTAIN_FIELD_NUMBER = 2;
        private static final Position DEFAULT_INSTANCE;
        public static final int EXCLUDE_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile ng60<Position> PARSER;
        private int bitField0_;
        private String id_ = "";
        private C3437l.h<String> contain_ = GeneratedMessageLite.emptyProtobufList();
        private C3437l.h<String> exclude_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Position, Builder> implements PositionOrBuilder {
            private Builder() {
                super(Position.DEFAULT_INSTANCE);
            }

            public Builder addAllContain(Iterable<String> iterable) {
                copyOnWrite();
                ((Position) this.instance).addAllContain(iterable);
                return this;
            }

            public Builder addAllExclude(Iterable<String> iterable) {
                copyOnWrite();
                ((Position) this.instance).addAllExclude(iterable);
                return this;
            }

            public Builder addContain(String str) {
                copyOnWrite();
                ((Position) this.instance).addContain(str);
                return this;
            }

            public Builder addContainBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) this.instance).addContainBytes(byteString);
                return this;
            }

            public Builder addExclude(String str) {
                copyOnWrite();
                ((Position) this.instance).addExclude(str);
                return this;
            }

            public Builder addExcludeBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) this.instance).addExcludeBytes(byteString);
                return this;
            }

            public Builder clearContain() {
                copyOnWrite();
                ((Position) this.instance).clearContain();
                return this;
            }

            public Builder clearExclude() {
                copyOnWrite();
                ((Position) this.instance).clearExclude();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Position) this.instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getContain(int i) {
                return ((Position) this.instance).getContain(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getContainBytes(int i) {
                return ((Position) this.instance).getContainBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public int getContainCount() {
                return ((Position) this.instance).getContainCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public List<String> getContainList() {
                return Collections.unmodifiableList(((Position) this.instance).getContainList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getExclude(int i) {
                return ((Position) this.instance).getExclude(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getExcludeBytes(int i) {
                return ((Position) this.instance).getExcludeBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public int getExcludeCount() {
                return ((Position) this.instance).getExcludeCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public List<String> getExcludeList() {
                return Collections.unmodifiableList(((Position) this.instance).getExcludeList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getId() {
                return ((Position) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getIdBytes() {
                return ((Position) this.instance).getIdBytes();
            }

            public Builder setContain(int i, String str) {
                copyOnWrite();
                ((Position) this.instance).setContain(i, str);
                return this;
            }

            public Builder setExclude(int i, String str) {
                copyOnWrite();
                ((Position) this.instance).setExclude(i, str);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Position) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) this.instance).setIdBytes(byteString);
                return this;
            }
        }

        static {
            Position position = new Position();
            DEFAULT_INSTANCE = position;
            position.makeImmutable();
        }

        private Position() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContain(Iterable<String> iterable) {
            ensureContainIsMutable();
            AbstractC3426a.addAll(iterable, this.contain_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExclude(Iterable<String> iterable) {
            ensureExcludeIsMutable();
            AbstractC3426a.addAll(iterable, this.exclude_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContain(String str) {
            str.getClass();
            ensureContainIsMutable();
            this.contain_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContainBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureContainIsMutable();
            this.contain_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExclude(String str) {
            str.getClass();
            ensureExcludeIsMutable();
            this.exclude_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExcludeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureExcludeIsMutable();
            this.exclude_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContain() {
            this.contain_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExclude() {
            this.exclude_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void ensureContainIsMutable() {
            if (this.contain_.mo17140q()) {
                return;
            }
            this.contain_ = GeneratedMessageLite.mutableCopy(this.contain_);
        }

        private void ensureExcludeIsMutable() {
            if (this.exclude_.mo17140q()) {
                return;
            }
            this.exclude_ = GeneratedMessageLite.mutableCopy(this.exclude_);
        }

        public static Position getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Position position) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(position);
        }

        public static Position parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Position> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContain(int i, String str) {
            str.getClass();
            ensureContainIsMutable();
            this.contain_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExclude(int i, String str) {
            str.getClass();
            ensureExcludeIsMutable();
            this.exclude_.set(i, str);
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Position();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.contain_.mo17139n();
                    this.exclude_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Position position = (Position) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, true ^ position.id_.isEmpty(), position.id_);
                    this.contain_ = interfaceC3409h.mo17053g(this.contain_, position.contain_);
                    this.exclude_ = interfaceC3409h.mo17053g(this.exclude_, position.exclude_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= position.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 10) {
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.contain_.mo17140q()) {
                                        this.contain_ = GeneratedMessageLite.mutableCopy(this.contain_);
                                    }
                                    this.contain_.add(strM17170L);
                                } else if (iM17171M == 26) {
                                    String strM17170L2 = c3430e.m17170L();
                                    if (!this.exclude_.mo17140q()) {
                                        this.exclude_ = GeneratedMessageLite.mutableCopy(this.exclude_);
                                    }
                                    this.exclude_.add(strM17170L2);
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
                        synchronized (Position.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getContain(int i) {
            return this.contain_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public ByteString getContainBytes(int i) {
            return ByteString.copyFromUtf8(this.contain_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public int getContainCount() {
            return this.contain_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public List<String> getContainList() {
            return this.contain_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getExclude(int i) {
            return this.exclude_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public ByteString getExcludeBytes(int i) {
            return ByteString.copyFromUtf8(this.exclude_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public int getExcludeCount() {
            return this.exclude_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public List<String> getExcludeList() {
            return this.exclude_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
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
            int iM16957L = 0;
            for (int i2 = 0; i2 < this.contain_.size(); i2++) {
                iM16957L += CodedOutputStream.m16957L(this.contain_.get(i2));
            }
            int size = iM16956K + iM16957L + getContainList().size();
            int iM16957L2 = 0;
            for (int i3 = 0; i3 < this.exclude_.size(); i3++) {
                iM16957L2 += CodedOutputStream.m16957L(this.exclude_.get(i3));
            }
            int size2 = size + iM16957L2 + getExcludeList().size();
            this.memoizedSerializedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            for (int i = 0; i < this.contain_.size(); i++) {
                codedOutputStream.mo16994D0(2, this.contain_.get(i));
            }
            for (int i2 = 0; i2 < this.exclude_.size(); i2++) {
                codedOutputStream.mo16994D0(3, this.exclude_.get(i2));
            }
        }

        public static Position parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Position parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static Position parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Position parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Position parseFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Position parseFrom(C3430e c3430e) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Position parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }

    public static final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
        private static final Resource DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PAGES_FIELD_NUMBER = 3;
        private static volatile ng60<Resource> PARSER = null;
        public static final int TEMPLATEID_FIELD_NUMBER = 2;
        private int bitField0_;
        private String id_ = "";
        private String templateID_ = "";
        private C3437l.h<ResourcePage> pages_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            resource.makeImmutable();
        }

        private Resource() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPages(Iterable<? extends ResourcePage> iterable) {
            ensurePagesIsMutable();
            AbstractC3426a.addAll(iterable, this.pages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPages() {
            this.pages_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateID() {
            this.templateID_ = getDefaultInstance().getTemplateID();
        }

        private void ensurePagesIsMutable() {
            if (this.pages_.mo17140q()) {
                return;
            }
            this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Resource resource) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resource);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePages(int i) {
            ensurePagesIsMutable();
            this.pages_.remove(i);
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
        public void setPages(int i, ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateID(String str) {
            str.getClass();
            this.templateID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateIDBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.templateID_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.pages_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Resource resource = (Resource) obj2;
                    this.id_ = interfaceC3409h.mo17052f(!this.id_.isEmpty(), this.id_, !resource.id_.isEmpty(), resource.id_);
                    this.templateID_ = interfaceC3409h.mo17052f(!this.templateID_.isEmpty(), this.templateID_, true ^ resource.templateID_.isEmpty(), resource.templateID_);
                    this.pages_ = interfaceC3409h.mo17053g(this.pages_, resource.pages_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= resource.bitField0_;
                    }
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
                                    this.id_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    this.templateID_ = c3430e.m17170L();
                                } else if (iM17171M == 26) {
                                    if (!this.pages_.mo17140q()) {
                                        this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
                                    }
                                    this.pages_.add((ResourcePage) c3430e.m17198w(ResourcePage.parser(), c3433h));
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
                        synchronized (Resource.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ResourcePage getPages(int i) {
            return this.pages_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public int getPagesCount() {
            return this.pages_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public List<ResourcePage> getPagesList() {
            return this.pages_;
        }

        public ResourcePageOrBuilder getPagesOrBuilder(int i) {
            return this.pages_.get(i);
        }

        public List<? extends ResourcePageOrBuilder> getPagesOrBuilderList() {
            return this.pages_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.id_.isEmpty() ? CodedOutputStream.m16956K(1, getId()) : 0;
            if (!this.templateID_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(2, getTemplateID());
            }
            for (int i2 = 0; i2 < this.pages_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(3, this.pages_.get(i2));
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public String getTemplateID() {
            return this.templateID_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ByteString getTemplateIDBytes() {
            return ByteString.copyFromUtf8(this.templateID_);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getId());
            }
            if (!this.templateID_.isEmpty()) {
                codedOutputStream.mo16994D0(2, getTemplateID());
            }
            for (int i = 0; i < this.pages_.size(); i++) {
                codedOutputStream.mo17029w0(3, this.pages_.get(i));
            }
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Resource parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Resource, Builder> implements ResourceOrBuilder {
            private Builder() {
                super(Resource.DEFAULT_INSTANCE);
            }

            public Builder addAllPages(Iterable<? extends ResourcePage> iterable) {
                copyOnWrite();
                ((Resource) this.instance).addAllPages(iterable);
                return this;
            }

            public Builder addPages(ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) this.instance).addPages(resourcePage);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Resource) this.instance).clearId();
                return this;
            }

            public Builder clearPages() {
                copyOnWrite();
                ((Resource) this.instance).clearPages();
                return this;
            }

            public Builder clearTemplateID() {
                copyOnWrite();
                ((Resource) this.instance).clearTemplateID();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public String getId() {
                return ((Resource) this.instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ByteString getIdBytes() {
                return ((Resource) this.instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ResourcePage getPages(int i) {
                return ((Resource) this.instance).getPages(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public int getPagesCount() {
                return ((Resource) this.instance).getPagesCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public List<ResourcePage> getPagesList() {
                return Collections.unmodifiableList(((Resource) this.instance).getPagesList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public String getTemplateID() {
                return ((Resource) this.instance).getTemplateID();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ByteString getTemplateIDBytes() {
                return ((Resource) this.instance).getTemplateIDBytes();
            }

            public Builder removePages(int i) {
                copyOnWrite();
                ((Resource) this.instance).removePages(i);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Resource) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Resource) this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPages(int i, ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) this.instance).setPages(i, resourcePage);
                return this;
            }

            public Builder setTemplateID(String str) {
                copyOnWrite();
                ((Resource) this.instance).setTemplateID(str);
                return this;
            }

            public Builder setTemplateIDBytes(ByteString byteString) {
                copyOnWrite();
                ((Resource) this.instance).setTemplateIDBytes(byteString);
                return this;
            }

            public Builder addPages(int i, ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) this.instance).addPages(i, resourcePage);
                return this;
            }

            public Builder setPages(int i, ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) this.instance).setPages(i, builder);
                return this;
            }

            public Builder addPages(ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) this.instance).addPages(builder);
                return this;
            }

            public Builder addPages(int i, ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) this.instance).addPages(i, builder);
                return this;
            }
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Resource parseFrom(C3430e c3430e) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(int i, ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.add(i, resourcePage);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Resource parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPages(int i, ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.set(i, resourcePage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.add(resourcePage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(int i, ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.add(i, builder.build());
        }
    }

    public static final class ResourceNode extends GeneratedMessageLite<ResourceNode, Builder> implements ResourceNodeOrBuilder {
        public static final int COLORS_FIELD_NUMBER = 8;
        public static final int CONTENTS_FIELD_NUMBER = 2;
        private static final ResourceNode DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 7;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int MERCURY_FIELD_NUMBER = 9;
        private static volatile ng60<ResourceNode> PARSER = null;
        public static final int SRC_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 6;
        public static final int URL_FIELD_NUMBER = 5;
        private int bitField0_;
        private Mercury mercury_;
        private String index_ = "";
        private C3437l.h<NodeContent> contents_ = GeneratedMessageLite.emptyProtobufList();
        private String src_ = "";
        private String url_ = "";
        private String type_ = "";
        private String direction_ = "";
        private C3437l.h<String> colors_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ResourceNode resourceNode = new ResourceNode();
            DEFAULT_INSTANCE = resourceNode;
            resourceNode.makeImmutable();
        }

        private ResourceNode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllColors(Iterable<String> iterable) {
            ensureColorsIsMutable();
            AbstractC3426a.addAll(iterable, this.colors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContents(Iterable<? extends NodeContent> iterable) {
            ensureContentsIsMutable();
            AbstractC3426a.addAll(iterable, this.contents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColors(String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColorsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            ensureColorsIsMutable();
            this.colors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColors() {
            this.colors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContents() {
            this.contents_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirection() {
            this.direction_ = getDefaultInstance().getDirection();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = getDefaultInstance().getIndex();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMercury() {
            this.mercury_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSrc() {
            this.src_ = getDefaultInstance().getSrc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        private void ensureColorsIsMutable() {
            if (this.colors_.mo17140q()) {
                return;
            }
            this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
        }

        private void ensureContentsIsMutable() {
            if (this.contents_.mo17140q()) {
                return;
            }
            this.contents_ = GeneratedMessageLite.mutableCopy(this.contents_);
        }

        public static ResourceNode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMercury(Mercury mercury) {
            Mercury mercury2 = this.mercury_;
            if (mercury2 == null || mercury2 == Mercury.getDefaultInstance()) {
                this.mercury_ = mercury;
            } else {
                this.mercury_ = Mercury.newBuilder(this.mercury_).mergeFrom(mercury).buildPartial();
            }
        }

        public static Builder newBuilder(ResourceNode resourceNode) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resourceNode);
        }

        public static ResourceNode parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ResourceNode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeContents(int i) {
            ensureContentsIsMutable();
            this.contents_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColors(int i, String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContents(int i, NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.set(i, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirection(String str) {
            str.getClass();
            this.direction_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.direction_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(String str) {
            str.getClass();
            this.index_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndexBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.index_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury.Builder builder) {
            this.mercury_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSrc(String str) {
            str.getClass();
            this.src_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSrcBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.src_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResourceNode();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.contents_.mo17139n();
                    this.colors_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ResourceNode resourceNode = (ResourceNode) obj2;
                    this.index_ = interfaceC3409h.mo17052f(!this.index_.isEmpty(), this.index_, !resourceNode.index_.isEmpty(), resourceNode.index_);
                    this.contents_ = interfaceC3409h.mo17053g(this.contents_, resourceNode.contents_);
                    this.src_ = interfaceC3409h.mo17052f(!this.src_.isEmpty(), this.src_, !resourceNode.src_.isEmpty(), resourceNode.src_);
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, !resourceNode.url_.isEmpty(), resourceNode.url_);
                    this.type_ = interfaceC3409h.mo17052f(!this.type_.isEmpty(), this.type_, !resourceNode.type_.isEmpty(), resourceNode.type_);
                    this.direction_ = interfaceC3409h.mo17052f(!this.direction_.isEmpty(), this.direction_, true ^ resourceNode.direction_.isEmpty(), resourceNode.direction_);
                    this.colors_ = interfaceC3409h.mo17053g(this.colors_, resourceNode.colors_);
                    this.mercury_ = (Mercury) interfaceC3409h.mo17061o(this.mercury_, resourceNode.mercury_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= resourceNode.bitField0_;
                    }
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
                                    this.index_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    if (!this.contents_.mo17140q()) {
                                        this.contents_ = GeneratedMessageLite.mutableCopy(this.contents_);
                                    }
                                    this.contents_.add((NodeContent) c3430e.m17198w(NodeContent.parser(), c3433h));
                                } else if (iM17171M == 26) {
                                    this.src_ = c3430e.m17170L();
                                } else if (iM17171M == 42) {
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 50) {
                                    this.type_ = c3430e.m17170L();
                                } else if (iM17171M == 58) {
                                    this.direction_ = c3430e.m17170L();
                                } else if (iM17171M == 66) {
                                    String strM17170L = c3430e.m17170L();
                                    if (!this.colors_.mo17140q()) {
                                        this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
                                    }
                                    this.colors_.add(strM17170L);
                                } else if (iM17171M == 74) {
                                    Mercury mercury = this.mercury_;
                                    Mercury.Builder builder = mercury != null ? mercury.toBuilder() : null;
                                    Mercury mercury2 = (Mercury) c3430e.m17198w(Mercury.parser(), c3433h);
                                    this.mercury_ = mercury2;
                                    if (builder != null) {
                                        builder.mergeFrom(mercury2);
                                        this.mercury_ = builder.buildPartial();
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
                        synchronized (ResourceNode.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getColors(int i) {
            return this.colors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getColorsBytes(int i) {
            return ByteString.copyFromUtf8(this.colors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public int getColorsCount() {
            return this.colors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public List<String> getColorsList() {
            return this.colors_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public NodeContent getContents(int i) {
            return this.contents_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public int getContentsCount() {
            return this.contents_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public List<NodeContent> getContentsList() {
            return this.contents_;
        }

        public NodeContentOrBuilder getContentsOrBuilder(int i) {
            return this.contents_.get(i);
        }

        public List<? extends NodeContentOrBuilder> getContentsOrBuilderList() {
            return this.contents_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getDirection() {
            return this.direction_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getDirectionBytes() {
            return ByteString.copyFromUtf8(this.direction_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getIndex() {
            return this.index_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getIndexBytes() {
            return ByteString.copyFromUtf8(this.index_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public Mercury getMercury() {
            Mercury mercury = this.mercury_;
            return mercury == null ? Mercury.getDefaultInstance() : mercury;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.index_.isEmpty() ? CodedOutputStream.m16956K(1, getIndex()) : 0;
            for (int i2 = 0; i2 < this.contents_.size(); i2++) {
                iM16956K += CodedOutputStream.m16948C(2, this.contents_.get(i2));
            }
            if (!this.src_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(3, getSrc());
            }
            if (!this.url_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(5, getUrl());
            }
            if (!this.type_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(6, getType());
            }
            if (!this.direction_.isEmpty()) {
                iM16956K += CodedOutputStream.m16956K(7, getDirection());
            }
            int iM16957L = 0;
            for (int i3 = 0; i3 < this.colors_.size(); i3++) {
                iM16957L += CodedOutputStream.m16957L(this.colors_.get(i3));
            }
            int size = iM16956K + iM16957L + getColorsList().size();
            if (this.mercury_ != null) {
                size += CodedOutputStream.m16948C(9, getMercury());
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getSrc() {
            return this.src_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getSrcBytes() {
            return ByteString.copyFromUtf8(this.src_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public boolean hasMercury() {
            return this.mercury_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.index_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getIndex());
            }
            for (int i = 0; i < this.contents_.size(); i++) {
                codedOutputStream.mo17029w0(2, this.contents_.get(i));
            }
            if (!this.src_.isEmpty()) {
                codedOutputStream.mo16994D0(3, getSrc());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(5, getUrl());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.mo16994D0(6, getType());
            }
            if (!this.direction_.isEmpty()) {
                codedOutputStream.mo16994D0(7, getDirection());
            }
            for (int i2 = 0; i2 < this.colors_.size(); i2++) {
                codedOutputStream.mo16994D0(8, this.colors_.get(i2));
            }
            if (this.mercury_ != null) {
                codedOutputStream.mo17029w0(9, getMercury());
            }
        }

        public static ResourceNode parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ResourceNode parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury mercury) {
            mercury.getClass();
            this.mercury_ = mercury;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ResourceNode, Builder> implements ResourceNodeOrBuilder {
            private Builder() {
                super(ResourceNode.DEFAULT_INSTANCE);
            }

            public Builder addAllColors(Iterable<String> iterable) {
                copyOnWrite();
                ((ResourceNode) this.instance).addAllColors(iterable);
                return this;
            }

            public Builder addAllContents(Iterable<? extends NodeContent> iterable) {
                copyOnWrite();
                ((ResourceNode) this.instance).addAllContents(iterable);
                return this;
            }

            public Builder addColors(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).addColors(str);
                return this;
            }

            public Builder addColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).addColorsBytes(byteString);
                return this;
            }

            public Builder addContents(NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) this.instance).addContents(nodeContent);
                return this;
            }

            public Builder clearColors() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearColors();
                return this;
            }

            public Builder clearContents() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearContents();
                return this;
            }

            public Builder clearDirection() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearDirection();
                return this;
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearIndex();
                return this;
            }

            public Builder clearMercury() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearMercury();
                return this;
            }

            public Builder clearSrc() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearSrc();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((ResourceNode) this.instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getColors(int i) {
                return ((ResourceNode) this.instance).getColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getColorsBytes(int i) {
                return ((ResourceNode) this.instance).getColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public int getColorsCount() {
                return ((ResourceNode) this.instance).getColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public List<String> getColorsList() {
                return Collections.unmodifiableList(((ResourceNode) this.instance).getColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public NodeContent getContents(int i) {
                return ((ResourceNode) this.instance).getContents(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public int getContentsCount() {
                return ((ResourceNode) this.instance).getContentsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public List<NodeContent> getContentsList() {
                return Collections.unmodifiableList(((ResourceNode) this.instance).getContentsList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getDirection() {
                return ((ResourceNode) this.instance).getDirection();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getDirectionBytes() {
                return ((ResourceNode) this.instance).getDirectionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getIndex() {
                return ((ResourceNode) this.instance).getIndex();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getIndexBytes() {
                return ((ResourceNode) this.instance).getIndexBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public Mercury getMercury() {
                return ((ResourceNode) this.instance).getMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getSrc() {
                return ((ResourceNode) this.instance).getSrc();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getSrcBytes() {
                return ((ResourceNode) this.instance).getSrcBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getType() {
                return ((ResourceNode) this.instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getTypeBytes() {
                return ((ResourceNode) this.instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getUrl() {
                return ((ResourceNode) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getUrlBytes() {
                return ((ResourceNode) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public boolean hasMercury() {
                return ((ResourceNode) this.instance).hasMercury();
            }

            public Builder mergeMercury(Mercury mercury) {
                copyOnWrite();
                ((ResourceNode) this.instance).mergeMercury(mercury);
                return this;
            }

            public Builder removeContents(int i) {
                copyOnWrite();
                ((ResourceNode) this.instance).removeContents(i);
                return this;
            }

            public Builder setColors(int i, String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setColors(i, str);
                return this;
            }

            public Builder setContents(int i, NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) this.instance).setContents(i, nodeContent);
                return this;
            }

            public Builder setDirection(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setDirection(str);
                return this;
            }

            public Builder setDirectionBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).setDirectionBytes(byteString);
                return this;
            }

            public Builder setIndex(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setIndex(str);
                return this;
            }

            public Builder setIndexBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).setIndexBytes(byteString);
                return this;
            }

            public Builder setMercury(Mercury mercury) {
                copyOnWrite();
                ((ResourceNode) this.instance).setMercury(mercury);
                return this;
            }

            public Builder setSrc(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setSrc(str);
                return this;
            }

            public Builder setSrcBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).setSrcBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((ResourceNode) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder addContents(int i, NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) this.instance).addContents(i, nodeContent);
                return this;
            }

            public Builder setContents(int i, NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) this.instance).setContents(i, builder);
                return this;
            }

            public Builder setMercury(Mercury.Builder builder) {
                copyOnWrite();
                ((ResourceNode) this.instance).setMercury(builder);
                return this;
            }

            public Builder addContents(NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) this.instance).addContents(builder);
                return this;
            }

            public Builder addContents(int i, NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) this.instance).addContents(i, builder);
                return this;
            }
        }

        public static ResourceNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourceNode parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ResourceNode parseFrom(InputStream inputStream) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceNode parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ResourceNode parseFrom(C3430e c3430e) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(int i, NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.add(i, nodeContent);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResourceNode parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContents(int i, NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.set(i, nodeContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.add(nodeContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(int i, NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.add(i, builder.build());
        }
    }

    public static final class ResourcePage extends GeneratedMessageLite<ResourcePage, Builder> implements ResourcePageOrBuilder {
        private static final ResourcePage DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int NODES_FIELD_NUMBER = 2;
        private static volatile ng60<ResourcePage> PARSER;
        private int bitField0_;
        private int index_;
        private C3437l.h<ResourceNode> nodes_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ResourcePage resourcePage = new ResourcePage();
            DEFAULT_INSTANCE = resourcePage;
            resourcePage.makeImmutable();
        }

        private ResourcePage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNodes(Iterable<? extends ResourceNode> iterable) {
            ensureNodesIsMutable();
            AbstractC3426a.addAll(iterable, this.nodes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.add(builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodes() {
            this.nodes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureNodesIsMutable() {
            if (this.nodes_.mo17140q()) {
                return;
            }
            this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
        }

        public static ResourcePage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ResourcePage resourcePage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resourcePage);
        }

        public static ResourcePage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourcePage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<ResourcePage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNodes(int i) {
            ensureNodesIsMutable();
            this.nodes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodes(int i, ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.set(i, builder.build());
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResourcePage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.nodes_.mo17139n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    ResourcePage resourcePage = (ResourcePage) obj2;
                    int i = this.index_;
                    boolean z2 = i != 0;
                    int i2 = resourcePage.index_;
                    this.index_ = interfaceC3409h.mo17051e(z2, i, i2 != 0, i2);
                    this.nodes_ = interfaceC3409h.mo17053g(this.nodes_, resourcePage.nodes_);
                    if (interfaceC3409h == GeneratedMessageLite.C3408g.INSTANCE) {
                        this.bitField0_ |= resourcePage.bitField0_;
                    }
                    return this;
                case 6:
                    C3430e c3430e = (C3430e) obj;
                    C3433h c3433h = (C3433h) obj2;
                    while (!z) {
                        try {
                            int iM17171M = c3430e.m17171M();
                            if (iM17171M != 0) {
                                if (iM17171M == 8) {
                                    this.index_ = c3430e.m17196u();
                                } else if (iM17171M == 18) {
                                    if (!this.nodes_.mo17140q()) {
                                        this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
                                    }
                                    this.nodes_.add((ResourceNode) c3430e.m17198w(ResourceNode.parser(), c3433h));
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
                        synchronized (ResourcePage.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public ResourceNode getNodes(int i) {
            return this.nodes_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public int getNodesCount() {
            return this.nodes_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public List<ResourceNode> getNodesList() {
            return this.nodes_;
        }

        public ResourceNodeOrBuilder getNodesOrBuilder(int i) {
            return this.nodes_.get(i);
        }

        public List<? extends ResourceNodeOrBuilder> getNodesOrBuilderList() {
            return this.nodes_;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.index_;
            int iM16984t = i2 != 0 ? CodedOutputStream.m16984t(1, i2) : 0;
            for (int i3 = 0; i3 < this.nodes_.size(); i3++) {
                iM16984t += CodedOutputStream.m16948C(2, this.nodes_.get(i3));
            }
            this.memoizedSerializedSize = iM16984t;
            return iM16984t;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.index_;
            if (i != 0) {
                codedOutputStream.mo17025s0(1, i);
            }
            for (int i2 = 0; i2 < this.nodes_.size(); i2++) {
                codedOutputStream.mo17029w0(2, this.nodes_.get(i2));
            }
        }

        public static ResourcePage parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ResourcePage parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<ResourcePage, Builder> implements ResourcePageOrBuilder {
            private Builder() {
                super(ResourcePage.DEFAULT_INSTANCE);
            }

            public Builder addAllNodes(Iterable<? extends ResourceNode> iterable) {
                copyOnWrite();
                ((ResourcePage) this.instance).addAllNodes(iterable);
                return this;
            }

            public Builder addNodes(ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) this.instance).addNodes(resourceNode);
                return this;
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((ResourcePage) this.instance).clearIndex();
                return this;
            }

            public Builder clearNodes() {
                copyOnWrite();
                ((ResourcePage) this.instance).clearNodes();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public int getIndex() {
                return ((ResourcePage) this.instance).getIndex();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public ResourceNode getNodes(int i) {
                return ((ResourcePage) this.instance).getNodes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public int getNodesCount() {
                return ((ResourcePage) this.instance).getNodesCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public List<ResourceNode> getNodesList() {
                return Collections.unmodifiableList(((ResourcePage) this.instance).getNodesList());
            }

            public Builder removeNodes(int i) {
                copyOnWrite();
                ((ResourcePage) this.instance).removeNodes(i);
                return this;
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((ResourcePage) this.instance).setIndex(i);
                return this;
            }

            public Builder setNodes(int i, ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) this.instance).setNodes(i, resourceNode);
                return this;
            }

            public Builder addNodes(int i, ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) this.instance).addNodes(i, resourceNode);
                return this;
            }

            public Builder setNodes(int i, ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) this.instance).setNodes(i, builder);
                return this;
            }

            public Builder addNodes(ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) this.instance).addNodes(builder);
                return this;
            }

            public Builder addNodes(int i, ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) this.instance).addNodes(i, builder);
                return this;
            }
        }

        public static ResourcePage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourcePage parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static ResourcePage parseFrom(InputStream inputStream) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourcePage parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static ResourcePage parseFrom(C3430e c3430e) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(int i, ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.add(i, resourceNode);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResourcePage parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodes(int i, ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.set(i, resourceNode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.add(resourceNode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(int i, ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.add(i, builder.build());
        }
    }

    public static final class Web extends GeneratedMessageLite<Web, Builder> implements WebOrBuilder {
        private static final Web DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        private static volatile ng60<Web> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 2;
        private Layout height_;
        private String url_ = "";
        private Layout width_;

        static {
            Web web = new Web();
            DEFAULT_INSTANCE = web;
            web.makeImmutable();
        }

        private Web() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = null;
        }

        public static Web getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeight(Layout layout) {
            Layout layout2 = this.height_;
            if (layout2 == null || layout2 == Layout.getDefaultInstance()) {
                this.height_ = layout;
            } else {
                this.height_ = Layout.newBuilder(this.height_).mergeFrom(layout).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWidth(Layout layout) {
            Layout layout2 = this.width_;
            if (layout2 == null || layout2 == Layout.getDefaultInstance()) {
                this.width_ = layout;
            } else {
                this.width_ = Layout.newBuilder(this.width_).mergeFrom(layout).buildPartial();
            }
        }

        public static Builder newBuilder(Web web) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(web);
        }

        public static Web parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Web) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ng60<Web> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(Layout.Builder builder) {
            this.height_ = builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3426a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(Layout.Builder builder) {
            this.width_ = builder.build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C46971.f16715xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Web();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.InterfaceC3409h interfaceC3409h = (GeneratedMessageLite.InterfaceC3409h) obj;
                    Web web = (Web) obj2;
                    this.url_ = interfaceC3409h.mo17052f(!this.url_.isEmpty(), this.url_, true ^ web.url_.isEmpty(), web.url_);
                    this.width_ = (Layout) interfaceC3409h.mo17061o(this.width_, web.width_);
                    this.height_ = (Layout) interfaceC3409h.mo17061o(this.height_, web.height_);
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
                                    this.url_ = c3430e.m17170L();
                                } else if (iM17171M == 18) {
                                    Layout layout = this.width_;
                                    Layout.Builder builder = layout != null ? layout.toBuilder() : null;
                                    Layout layout2 = (Layout) c3430e.m17198w(Layout.parser(), c3433h);
                                    this.width_ = layout2;
                                    if (builder != null) {
                                        builder.mergeFrom(layout2);
                                        this.width_ = builder.buildPartial();
                                    }
                                } else if (iM17171M == 26) {
                                    Layout layout3 = this.height_;
                                    Layout.Builder builder2 = layout3 != null ? layout3.toBuilder() : null;
                                    Layout layout4 = (Layout) c3430e.m17198w(Layout.parser(), c3433h);
                                    this.height_ = layout4;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(layout4);
                                        this.height_ = builder2.buildPartial();
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
                        synchronized (Web.class) {
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

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public Layout getHeight() {
            Layout layout = this.height_;
            return layout == null ? Layout.getDefaultInstance() : layout;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM16956K = !this.url_.isEmpty() ? CodedOutputStream.m16956K(1, getUrl()) : 0;
            if (this.width_ != null) {
                iM16956K += CodedOutputStream.m16948C(2, getWidth());
            }
            if (this.height_ != null) {
                iM16956K += CodedOutputStream.m16948C(3, getHeight());
            }
            this.memoizedSerializedSize = iM16956K;
            return iM16956K;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public Layout getWidth() {
            Layout layout = this.width_;
            return layout == null ? Layout.getDefaultInstance() : layout;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public boolean hasHeight() {
            return this.height_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public boolean hasWidth() {
            return this.width_ != null;
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.url_.isEmpty()) {
                codedOutputStream.mo16994D0(1, getUrl());
            }
            if (this.width_ != null) {
                codedOutputStream.mo17029w0(2, getWidth());
            }
            if (this.height_ != null) {
                codedOutputStream.mo17029w0(3, getHeight());
            }
        }

        public static Web parseDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Web) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Web parseFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c3433h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(Layout layout) {
            layout.getClass();
            this.height_ = layout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(Layout layout) {
            layout.getClass();
            this.width_ = layout;
        }

        public static final class Builder extends GeneratedMessageLite.AbstractC3403b<Web, Builder> implements WebOrBuilder {
            private Builder() {
                super(Web.DEFAULT_INSTANCE);
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((Web) this.instance).clearHeight();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Web) this.instance).clearUrl();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((Web) this.instance).clearWidth();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public Layout getHeight() {
                return ((Web) this.instance).getHeight();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public String getUrl() {
                return ((Web) this.instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public ByteString getUrlBytes() {
                return ((Web) this.instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public Layout getWidth() {
                return ((Web) this.instance).getWidth();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public boolean hasHeight() {
                return ((Web) this.instance).hasHeight();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public boolean hasWidth() {
                return ((Web) this.instance).hasWidth();
            }

            public Builder mergeHeight(Layout layout) {
                copyOnWrite();
                ((Web) this.instance).mergeHeight(layout);
                return this;
            }

            public Builder mergeWidth(Layout layout) {
                copyOnWrite();
                ((Web) this.instance).mergeWidth(layout);
                return this;
            }

            public Builder setHeight(Layout layout) {
                copyOnWrite();
                ((Web) this.instance).setHeight(layout);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Web) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Web) this.instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setWidth(Layout layout) {
                copyOnWrite();
                ((Web) this.instance).setWidth(layout);
                return this;
            }

            public Builder setHeight(Layout.Builder builder) {
                copyOnWrite();
                ((Web) this.instance).setHeight(builder);
                return this;
            }

            public Builder setWidth(Layout.Builder builder) {
                copyOnWrite();
                ((Web) this.instance).setWidth(builder);
                return this;
            }
        }

        public static Web parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Web parseFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c3433h);
        }

        public static Web parseFrom(InputStream inputStream) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web parseFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c3433h);
        }

        public static Web parseFrom(C3430e c3430e) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Web parseFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, c3430e, c3433h);
        }
    }
}
