package com.immomo.svgaplayer.htmlParser;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.util.ArrayMap;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J \u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0016J \u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u000eH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u000eH\u0016J(\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0010H\u0016J \u0010-\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0016J\u0016\u00101\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0013J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000eH\u0016J\b\u00108\u001a\u00020\u0018H\u0016J(\u00109\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;H\u0016J \u0010<\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0018\u0010=\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010>\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/HtmlTagHandler;", "Landroid/text/Html$TagHandler;", "Landroid/text/Html$ImageGetter;", "Lorg/xml/sax/ContentHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "count", "", "originalContentHandler", "originalEditableText", "Landroid/text/Editable;", "originalTags", "", "", "originalXmlReader", "Lorg/xml/sax/XMLReader;", "tagHandlerMap", "", "Lcom/immomo/svgaplayer/htmlParser/HtmlTag;", "canHandleTag", "", "tagName", "characters", "", "ch", "", "start", "length", "endDocument", "endElement", "uri", "localName", "qName", "endHandleTag", "tag", "output", "xmlReader", "endPrefixMapping", RequestParameters.PREFIX, "getDrawable", "Landroid/graphics/drawable/Drawable;", "source", "handleTag", "opening", "ignorableWhitespace", "processingInstruction", Target.TYPE, "data", "registerTag", "tagHandler", "setDocumentLocator", "locator", "Lorg/xml/sax/Locator;", "skippedEntity", AuthenticationTokenClaims.JSON_KEY_NAME, "startDocument", "startElement", "atts", "Lorg/xml/sax/Attributes;", "startHandleTag", "startPrefixMapping", "unregisterTag", "Companion", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class HtmlTagHandler implements Html.TagHandler, Html.ImageGetter, ContentHandler {
    private static final String FONT_TAG = "font";
    private static final String H5_TAG = "html";
    private static final String LOG_TAG = "HtmlTagHandler";
    private int count;
    private volatile ContentHandler originalContentHandler;
    private Editable originalEditableText;
    private List<String> originalTags;
    private XMLReader originalXmlReader;
    private final Map<String, HtmlTag> tagHandlerMap;

    public HtmlTagHandler(@NotNull Context context) {
        context.getClass();
        List<String> listSplit = new Regex("\\|").split("br|p|ul|li|div|span|strong|b|em|cite|dnf|i|big|small|font|blockquote|tt|a|u|del|s|strike|sup|sub|h1|h2|h3|h4|h5|h6|img", 0);
        if (listSplit == null) {
            C0799b.m4641a("null cannot be cast to non-null type java.util.Collection<T>");
            throw null;
        }
        Object[] array = listSplit.toArray(new String[0]);
        if (array == null) {
            C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
            throw null;
        }
        String[] strArr = (String[]) array;
        this.originalTags = CollectionsKt.listOf(Arrays.copyOf(strArr, strArr.length));
        ArrayMap arrayMap = new ArrayMap();
        this.tagHandlerMap = arrayMap;
        arrayMap.put(FONT_TAG, new FontTag(context));
    }

    private final boolean canHandleTag(String tagName) {
        return this.tagHandlerMap.containsKey(tagName) && this.tagHandlerMap.get(tagName) != null;
    }

    private final void endHandleTag(String tag, Editable output, XMLReader xmlReader) {
        Objects.toString(output);
        if (C15493d.m94381x(tag, tag, true)) {
            int i = this.count - 1;
            this.count = i;
            if (i == 0) {
                XMLReader xMLReader = this.originalXmlReader;
                if (xMLReader == null) {
                    Intrinsics.m88391r("originalXmlReader");
                }
                xMLReader.setContentHandler(this.originalContentHandler);
                this.originalContentHandler = null;
            }
        }
    }

    private final void startHandleTag(String tag, Editable output, XMLReader xmlReader) {
        Objects.toString(output);
        if (C15493d.m94381x(tag, "html", true)) {
            if (this.originalContentHandler == null) {
                this.originalContentHandler = xmlReader.getContentHandler();
                this.originalXmlReader = xmlReader;
                xmlReader.setContentHandler(this);
                this.originalEditableText = output;
            }
            this.count++;
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(@NotNull char[] ch, int start, int length) throws SAXException {
        ch.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.characters(ch, start, length);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.endDocument();
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(@NotNull String uri, @NotNull String localName, @NotNull String qName) throws SAXException {
        uri.getClass();
        localName.getClass();
        qName.getClass();
        if (C15493d.m94381x(localName, "html", true)) {
            Editable editable = this.originalEditableText;
            if (editable == null) {
                Intrinsics.m88391r("originalEditableText");
            }
            XMLReader xMLReader = this.originalXmlReader;
            if (xMLReader == null) {
                Intrinsics.m88391r("originalXmlReader");
            }
            handleTag(false, localName, editable, xMLReader);
            return;
        }
        if (!canHandleTag(localName)) {
            if (this.originalTags.contains(localName)) {
                ContentHandler contentHandler = this.originalContentHandler;
                if (contentHandler == null) {
                    Intrinsics.m88386m();
                }
                contentHandler.endElement(uri, localName, qName);
                return;
            }
            return;
        }
        HtmlTag htmlTag = this.tagHandlerMap.get(localName);
        if (htmlTag == null) {
            Intrinsics.m88386m();
        }
        Editable editable2 = this.originalEditableText;
        if (editable2 == null) {
            Intrinsics.m88391r("originalEditableText");
        }
        htmlTag.endHandleTag(editable2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(@NotNull String prefix) throws SAXException {
        prefix.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.endPrefixMapping(prefix);
        }
    }

    @Override // android.text.Html.ImageGetter
    @Nullable
    public Drawable getDrawable(@NotNull String source) {
        source.getClass();
        return null;
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, @NotNull String tag, @NotNull Editable output, @NotNull XMLReader xmlReader) {
        tag.getClass();
        output.getClass();
        xmlReader.getClass();
        if (opening) {
            startHandleTag(tag, output, xmlReader);
        } else {
            endHandleTag(tag, output, xmlReader);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(@NotNull char[] ch, int start, int length) throws SAXException {
        ch.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.ignorableWhitespace(ch, start, length);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(@NotNull String target, @NotNull String data) throws SAXException {
        target.getClass();
        data.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.processingInstruction(target, data);
        }
    }

    public final void registerTag(@NotNull String tagName, @NotNull HtmlTag tagHandler) {
        tagName.getClass();
        tagHandler.getClass();
        this.tagHandlerMap.put(tagName, tagHandler);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(@NotNull Locator locator) {
        locator.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.setDocumentLocator(locator);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(@NotNull String name) throws SAXException {
        name.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.skippedEntity(name);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.startDocument();
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(@NotNull String uri, @NotNull String localName, @NotNull String qName, @NotNull Attributes atts) throws SAXException {
        uri.getClass();
        localName.getClass();
        qName.getClass();
        atts.getClass();
        if (C15493d.m94381x(localName, "html", true)) {
            Editable editable = this.originalEditableText;
            if (editable == null) {
                Intrinsics.m88391r("originalEditableText");
            }
            XMLReader xMLReader = this.originalXmlReader;
            if (xMLReader == null) {
                Intrinsics.m88391r("originalXmlReader");
            }
            handleTag(true, localName, editable, xMLReader);
            return;
        }
        if (canHandleTag(localName)) {
            HtmlTag htmlTag = this.tagHandlerMap.get(localName);
            if (htmlTag == null) {
                Intrinsics.m88386m();
            }
            Editable editable2 = this.originalEditableText;
            if (editable2 == null) {
                Intrinsics.m88391r("originalEditableText");
            }
            htmlTag.startHandleTag(editable2, atts);
            return;
        }
        if (this.originalTags.contains(localName)) {
            ContentHandler contentHandler = this.originalContentHandler;
            if (contentHandler == null) {
                Intrinsics.m88386m();
            }
            contentHandler.startElement(uri, localName, qName, atts);
            return;
        }
        Log.e(LOG_TAG, "无法解析该标签：<" + localName + '>');
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(@NotNull String prefix, @NotNull String uri) throws SAXException {
        prefix.getClass();
        uri.getClass();
        ContentHandler contentHandler = this.originalContentHandler;
        if (contentHandler != null) {
            contentHandler.startPrefixMapping(prefix, uri);
        }
    }

    @Nullable
    public final HtmlTag unregisterTag(@NotNull String tagName) {
        tagName.getClass();
        return this.tagHandlerMap.remove(tagName);
    }
}
