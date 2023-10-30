package tn.m1pdam.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class NewsPage extends AppCompatActivity {

    List<Article> articles = new ArrayList<>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);
        setTitle("News");

        articles.add(new Article("The Take: Wael Dahdouh’s family was killed in Gaza. He kept reporting.",
                "We remember the family of Wael al-Dahdouh and talk about what it means to be a journalist today in Gaza.",
                "na1",
                "Al Jazeera bureau chief Wael Dahdouh was reporting live in Gaza when he discovered an Israeli air raid had killed his wife, son, daughter, grandson, and at least eight other relatives. Today, we tell Wael’s story through the eyes of his colleagues, about facing death to report through war."));
        articles.add(new Article("Displaced Palestinians in overcrowded UN schools face outbreak of disease",
                "More than half a million displaced Palestinians, amidst Israeli attacks, are sheltering in 150 UNRWA facilities in poor conditions without basic necessities.",
                "na2",
                "Al-Maghazi, Gaza Strip – Days after a UNRWA school in the central Gaza Strip was hit by Israel, killing at least six people, clothes and blankets still hang from the windows and balconies of its other schools, turning the traditional white and blue colours of the United Nations Palestinian refugee agency into a patchwork of bright colours.\n" +
                        "\n" +
                        "The schools have become places of refuge for hundreds of thousands of displaced Palestinians in the Gaza Strip, many of whom believe that the UN designation of these buildings will keep them safe from the constant Israeli bombardment."+"\n"+
                        "According to the UNRWA, more than 613,000 of 1.4 million internally displaced people in Gaza are sheltering in 150 of its facilities across the blockaded territory.\n" +
                        "\n" +
                        "But severe overcrowding, a lack of privacy and inadequate sanitation have put these schools at risk of a prolonged and severe public health crisis, adding pressure to the already overloaded healthcare system which doctors and the health ministry describe as being in a state of total collapse.\n" +
                        "\n" +
                        "And now, with the bombing of the school in the al-Maghazi refugee camp, in which dozens were injured, it is clear that schools may not be the places of sanctuary humanitarian agencies hoped for.\n" +
                        "\n" +
                        "“This is outrageous, and it again shows a flagrant disregard for the lives of civilians,” Philippe Lazzarini, UNRWA Commissioner-General, said. “No place is safe in Gaza any more, not even UNRWA facilities.\n" +
                        "\n" +
                        "“At least 4,000 people have taken refuge in this UNRWA school-turned-shelter. They had and still have nowhere else to go.”\n" +
                        "\n" +
                        "The displaced people in these schools also lack access to life necessities such as water, electricity, food, milk, nappies and essential supplies for period health including sanitary pads, disinfectants and pain relief.\n" +
                        "\n" +
                        "The UN agency said that some shelters are currently hosting 10 to 12 times more people than their capacity."));
        articles.add(new Article("‘Solidarity with Palestine’: British protesters defy threats to hit streets",
                "‘Solidarity with Palestine’: British protesters defy threats to hit streets",
                "na3",
                "Glasgow, United Kingdom — Dozens of young British trade unionists blocked access into Instro Precision Ltd – a subsidiary of Elbit Systems which manufactures Israeli military apparatus – on Thursday in protest at Israel’s continuing bombardment of the Gaza Strip.\n" +
                        "\n" +
                        "The rally, which began in the early morning at the company’s site in Kent, southeast England, saw more than 100 teachers, academics, healthcare providers and others unfurl giant banners reading “Workers For A Free Palestine” and “UK: Stop Arming Israel”."+
                        "\n"+
                        "Demonstrations opposing the deadly campaign of Israeli air strikes – which were launched in response to the October 7 Hamas attack on southern Israel and which have killed more than 7,000 Gaza residents, including 3,000 children – have swept Britain in recent weeks.\n" +
                                "\n" +
                                "But, from small gatherings to much larger rallies in cities including Glasgow, Manchester and London, where some 100,000 pro-Palestinian activists marched in the British capital on October 21, voices condemning Israel have had to contend with a UK government which has pledged its unwavering support for Prime Minister Benjamin Netanyahu."
                                +"\n"+
                                "“There’s no doubt that the British government and the Western media generally are very complicit in what’s happening in Gaza,” Jeanine Hourani, who was representing the Palestinian Youth Movement on the mass picket at Instro Precision Ltd, told Al Jazeera. “They are supporting a genocide that is unfolding there.”\n" +
                                "\n" +
                                "Indeed, the British state – which during the first world war publicly promised to establish “a national home for the Jewish people” in its controversial 1917 Balfour Declaration – has so far refused to act on overwhelming calls by UK activists to pressure Israel to cease its brutal shelling of Gaza.\n" +
                                "\n" +
                                "Echoing the likes of US President Joe Biden and French President Emmanuel Macron, UK Prime Minister Rishi Sunak pledged to support Israel’s right to retaliate against Hamas, which killed some 1,400 Israelis during its attack earlier this month.\n" +
                                "\n" +
                                "But on Tuesday, Amnesty International, which deems Israel an apartheid state on account of its occupation of the West Bank and its blockade of the Hamas-controlled Gaza Strip, accused Israel of “indiscriminate attacks, which caused mass [Palestinian] civilian casualties and must be investigated as war crimes”.\n" +
                                "\n" +
                                "“It’s very difficult to determine exactly what impact [these protests] are having on the British government,” Chris Doyle, director of the London-based Council for Arab-British Understanding (CAABU), told Al Jazeera.\n" +
                                "\n" +
                                "“What we are seeing is a slight shift in the language [of the British government] to acknowledge more the humanitarian suffering in Gaza. What we are not seeing is a call to end the siege or any criticism of the Israeli actions in Gaza where they have been targeting civilian facilities such as schools, bakeries, hospitals and water installations,” he added.\n" +
                                "\n" +
                                "Carrie Harper, a Welsh county councillor and pro-Palestinian campaigner, maintained that British “public backlash” had forced the Conservative Party government into this tonal shift, but, like Doyle, lamented that the “overall position remained unchanged”.\n" +
                                "\n" +
                                "“There is no balanced view being taken, there is no call for a ceasefire, and I find it incredibly saddening that [the UK government] is incapable of calling for peace,” she added. “It shows an incredible lack of leadership.”"));
        articles.add(new Article("Israeli forces kill four Palestinians in occupied West Bank: WAFA",
                "The Palestinian news agency says the latest deaths take the number of Palestinians killed in the territory to 110 since the Gaza war began.",
                "na4",
                "Israeli forces have killed four Palestinians during raids in the occupied West Bank, according to the official Palestinian news agency WAFA.\n" +
                        "\n" +
                        "As its war against the Hamas group in the Gaza Strip continues for three weeks, Israel has stepped up operations against Palestinian groups in the West Bank, killing many Palestinians and arresting hundreds."+
                        "\n"+
                        "Israel says one soldier was killed in a clash during the raids on Friday.\n" +
                        "\n" +
                        "The Israeli military said, that during the West Bank operation, its troops came under attack in the city of Jenin and they fired back, killing Ayser al-Amar of the Palestinian Islamic Jihad (PIJ) group.\n" +
                        "\n" +
                        "PIJ confirmed that al-Amar belonged to the group. Two more people killed were also identified as PIJ fighters, according to the Reuters news agency.\n" +
                        "\n" +
                        "Hamas said one of its men, Jawad al-Turki, was also killed during the Jenin fighting.\n" +
                        "\n" +
                        "WAFA said the latest deaths took the number of Palestinians killed in the occupied territory since the Israel-Gaza war broke out to 110, with more than 1,900 people injured."));
        articles.add(new Article("Israeli bombing levels a residential square on Gaza City’s Jalaa Street",
                "Yarmouk Square, and all of its apartment buildings, was targeted and destroyed by Israeli air raids.",
                "na6",
                "Gaza City – At least 30 Israeli missiles targeted the residential Yarmouk Square in Gaza City, levelling at least eight inhabited apartment buildings.\n" +
                        "\n" +
                        "A massive black cloud of smoke and dust rose from Jalaa Street on Wednesday afternoon, and hundreds of Palestinians rushed to the site to rescue survivors trapped under the rubble.\n" +
                        "\n" +
                        "As two boys pulled from the rubble were carried away on a stretcher, arms around each other, they cried out: “Thank you, civil defence! We love you!”\n" +
                        "\n" +
                        "“The civil defence and ambulance crews have so far recovered 120 killed Palestinians and approximately 260 wounded from Yarmouk Square,” said Iyad al-Buzum, the spokesman for the interior ministry in Gaza, on Thursday. “We still have 300 missing people under the rubble.”\n" +
                        "\n" +
                        "This brings the number of people trapped under the rubble since the Israeli bombardment of the Gaza Strip began on October 7 to 1,950 people, including 900 children.\n" +
                        "\n" +
                        "More than 7,028 Palestinians have been killed over the past 20 days, including 2,913 children and 1,709 women.\n" +
                        "\n" +
                        "Al-Buzum said that due to the absence of heavy machinery and lack of fuel, civil defence crews will need about a week to recover the missing people.\n" +
                        "\n" +
                        "About 45 percent of the Gaza Strip’s housing units, or 200,000 units, have been destroyed or badly damaged, Palestinian officials say.\n" +
                        "\n" +
                        "Salama Marouf, the head of the government media office in Gaza, told Al Jazeera Israel is using munitions that cause massive destruction to infrastructure, and that there are many indications that Israel is using internationally banned explosives, pointing to the melting limbs of some of the wounded.\n" +
                        "\n" +
                        "“The criminality of the occupier in the current aggression is unprecedented,” Marouf said. “It has wiped out entire families from the civil registry, levelled neighbourhoods and residential communities with their residents, and destroyed facilities including hospitals, places of worship, bakeries, water filling stations, markets, schools, and educational and service institutions.”\n" +
                        "\n" +
                        "Lynn Hastings, the UN humanitarian coordinator for the occupied Palestinian territory, said that “nowhere is safe in Gaza”.\n" +
                        "\n" +
                        "“When the evacuation routes are bombed, when people north as well as south are caught up in hostilities, when the essentials for survival are lacking, and when there are no assurances for return, people are left with nothing but impossible choices,” she said."));
        articles.add(new Article("Israel conducts second ground raid into northern Gaza with air support",
                "The overnight incursion was backed by fighter jets and drones that hit targets in Shujaiya area, Israel’s army says.",
                "na5",
                "The Israeli army, backed by fighter jets and drones, has carried out a second limited ground raid into Gaza in as many days and struck targets on the outskirts of Gaza City, according to its military, as it prepares for a widely expected ground invasion.\n" +
                        "\n" +
                        "The Israeli military said on Friday that ground forces entered Gaza overnight and struck dozens of Hamas targets during its raid in the Shujaiya area."
                        +"\n"+
                        "It said aircraft and artillery bombed targets in the neighbourhood on the outskirts of Gaza City, and that its soldiers exited the territory after several hours without suffering any casualties.\n" +
                        "\n" +
                        "“The raid began yesterday in broad daylight … it ended successfully in the hours of this morning,” the Israeli army’s spokesperson said.\n" +
                        "\n" +
                        "Black-and-white footage released by the Israeli army showed a column of armoured vehicles as a thick cloud of dust billowed into the sky after the strikes.\n" +
                        "\n" +
                        "Later on Friday, Hamas’s military wing said Israeli forces at dawn attempted to carry out a landing operation on the Rafah beach in southern Gaza Strip.\n" +
                        "\n" +
                        "“The attempt was discovered by our fighters, and they confronted it and clashed with the enemy. This required the intervention of the Zionist [Israeli] Air Force, which saved the force, so it fled towards the sea, leaving behind a quantity of ammunition,” the Qassam Brigades said in a Telegram post."));

        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new Adapter(articles,this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            Intent i = new Intent(NewsPage.this, MainActivity.class);
            startActivity(i);
        }else if(id == R.id.exit){
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}