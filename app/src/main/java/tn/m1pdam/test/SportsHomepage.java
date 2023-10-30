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

public class SportsHomepage extends AppCompatActivity {

    List<Article> articles = new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_homepage);
        setTitle("Sports News");

        articles.add(new Article("Celtic fans defy club to fly Palestine flags in Champions League match",
                "Fans displayed banners and held up thousands of Palestine flags during their team’s UEFA Champions League match against Atletico Madrid.",
                "sa6","Fans of Scotland’s Celtic Football Club have defied their club’s directives and waved thousands of Palestine flags during their team’s UEFA Champions League match against Atletico Madrid.\n" +
                "\n" +
                "The Scottish Premiership champions hosted the Spanish club for their group-stage match at Glasgow’s Celtic Park on Wednesday."
                +"\n"+
                "Hours ahead of the match, the club issued a statement saying both teams’ players and coaching staff would wear black armbands “as a show of respect and support for all those affected by the conflict [between Israel and Palestine],” but told fans to refrain from displaying their support in the stands.\n" +
                "\n" +
                "“We ask that banners, flags and symbols relating to the conflict and those countries involved in it are not displayed at Celtic Park at this time,” the club said in its statement.\n" +
                "\n" +
                "However, fans paid no heed to the directives and held up thousands of Palestine flags ahead of kickoff and continued to wave them during the match."
                +"\n" +
                "Fans at the North Curve section of the stadium prepared a tifo – a choreographed display – of the Palestine flag and unfurled large flags behind the home team’s goal during the first half of the match.\n" +
                "\n" +
                "Several thousand fans in other parts of the stadium held up a sea of smaller flags as they sang along to the famous football anthem “You’ll Never Walk Alone” and shouted slogans in support of Palestine before the match got under way.\n" +
                "\n" +
                "The Green Brigade, an ultras group of hardcore Celtic fans, had encouraged supporters to defy the club’s statement and continue their display of solidarity with the Palestinians."));
        articles.add(new Article("AFRICAN FOOTBALL LEAGUE: EPERANCE DE TUNIS ELIMINATES TP MAZEMBE AND GOES TO THE SEMI-FINALS",
                "L'Espérance de Tunis a gagné ce jeudi son billet pour les demi-finales de l'African Football League.",
                "sa4",
                "In the return match of the quarter-finals against TP Mazembe, the Esperanto team largely won this afternoon with a score of three goals to zero (first leg 0-1).\n" +
                        "\n" +
                        "Yassine Meriah (45+1 min), Oussema Bouguerra (76 min) and Mohamed Amine Tougai (87 min) scored the three goals of this meeting.\n" +
                        "\n" +
                        "Very little threatened throughout the match, Amanallah Memmich produced the decisive save of the match by pushing the Congolese ball back to his goal line in the 64th minute.\n" +
                        "\n" +
                        "In the semi-final, Espérance Sportive de Tunis will face Wydad Casablanca or Enyimba."));
        articles.add(new Article("Real Madrid prepare for Barcelona clash",
                "The team play the Clásico on LaLiga matchday eleven at the Estadio Olímpico Lluís Companys (Saturday, 4:15pm CEST).",
                "sa7",
                "Following the Champions League win over Braga, Real Madrid completed their first training session in preparation for the Clásico against Barcelona on LaLiga matchday 11, set to be played at the Estadio Olímpico Lluís Companys (Saturday, 4:15pm CEST).\n" +
                        "\n" +
                        "The players kicked off with an intense workout in the gym. They then moved outside to work on control and possession drills, before finishing up with a series of games on reduced-size pitches. Ceballos and Bellingham worked out using the indoor facilities."));
        articles.add(new Article("MANCHESTER UNITED 1-0 FC COPENHAGEN: ANDRE ONANA SAVES LAST-MINUTE PENALTY AS RED DEVILS CLAIM EMOTIONAL WIN",
                "There was redemption for Harry Maguire and Andre Onana as the former scored and the latter saved a last-minute penalty as Manchester United collected a 1-0 win against FC Copenhagen at Old Trafford.",
                "sa5",
                "A Harry Maguire goal and Andre Onana penalty save rescued Manchester United's UEFA Champions League campaign as the Red Devils beat FC Copenhagen 1-0 in what manager Erik ten Hag had identified as a must-win game."+"\n" +
                        "Copenhagen started far better than the hosts and hit the post after just five minutes through Diogo Goncalves, while five minutes into the second half they came close again, only to be denied by a super Onana save."+"\n" +
                        "Half-time substitute Christian Eriksen forced an equally good save from Copenhagen's goalkeeper soon after, and was then central to the goal."
                        +"\n"+
                        "When Maguire headed an uninspired United into the lead on 72 minutes, he was nodding home a pinpoint cross delivered by Eriksen."+"\n" +
                        "It sparked a much better closing 20 minutes from the home side, but their hard work was set to be undone when the visitors - with the minimum four minutes of added time up - were awarded a penalty for a Scott McTominay high boot.\n" +
                        "However, Onana saved Jordan Larsson's penalty, getting a strong hand to the shot to keep it out and produce his best moment to date in a United shirt."+"\n" +
                        "The dramatic finish capped an emotional night at Old Trafford, with this the first home game since the passing of club legend Sir Bobby Charlton."+"\n" +
                        "Man United now have three points and are third in Group A, a point off second-placed Galatasaray. Copenhagen are bottom on one point and Bayern Munich are top with three wins from three."));
        articles.add(new Article("Makhachev stops Volkanovski in first round to retain UFC lightweight crown",
                "Meanwhile, in UFC 294’s co-main event, middleweight Khamzat Chimaev beat Kamaru Usman by majority decision.",
                "sa1",
                "Lightweight champion Islam Makhachev has retained his title with a first-round stoppage of Alexander Volkanovski at UFC 294, an Ultimate Fighting Championship event in Abu Dhabi, United Arab Emirates.\n" +
                        "\n" +
                        "The Saturday night fight was a rematch from UFC 284 in February, when Makhachev of Russia won by unanimous decision."
                        +"\n"+
                        "Featherweight champion Volkanovski of Australia, taking the fight on just 11 days’ notice, moved up to the 155-pound (70.3kg) limit to be a replacement for former lightweight champion Charles Oliveira, who suffered an injury during training.\n" +
                        "\n" +
                        "This fight did not get past 3:06 of the first round. The 31-year-old Makhachev (25-1-0, five KOs) took down the 35-year-old Volkanovski (26-3, 13 KOs) with a head kick and finished him off with strikes on the ground.\n" +
                        "\n" +
                        "“I have a great team. We always did this in the locker room, in the training – pushed me very hard,” Makhachev said. “I showed him a couple of low kicks, couple of body kicks and then changed to head kick. I want to say thank you to this guy [Volkanovski]. He’s a real champion.”"));
        articles.add(new Article("Brazil’s Neymar to have knee surgery after rupturing ACL, meniscus",
                "Neymar was stretchered off in tears during Brazil’s World Cup qualifying match against Uruguay.",
                "sa2",
                "Football superstar Neymar has a torn ligament and meniscus in his left knee and will have to undergo surgery after being injured during Brazil’s 2-0 loss to Uruguay, the Brazilian Football Confederation (CBF) has said.\n" +
                        "\n" +
                        "The 31-year-old, who joined Saudi Arabian side Al Hilal from Paris Saint-Germain in August, was stretchered off in tears just before halftime in Brazil’s 2026 World Cup qualifying match in Montevideo on Tuesday."
                        +"\n"+
                        "Neymar will undergo surgery for the injuries at a “yet-to-be-determined date,” the CBF said on Wednesday, after a series of medical exams on the player in Sao Paulo.\n" +
                        "\n" +
                        "Neymar went down after tussling for the ball with Uruguay’s Nicolas de la Cruz in the 44th minute of Brazil’s 2-0 defeat on Tuesday, holding his left leg in pain and calling for medical attention as his teammates looked on anxiously. He left the stadium on crutches and wearing a leg brace after the match.\n" +
                        "\n" +
                        "“Brazilian and world football need Neymar healthy and recovered, because football is happier when he’s on the pitch,” CBF president Ednaldo Rodrigues said in a statement.\n" +
                        "\n" +
                        "The injury is expected to sideline the forward for several months.\n" +
                        "\n" +
                        "The CBF said its medical department and Al Hilal are in “constant contact” and “aligned” on helping the striker recover.\n" +
                        "\n"));

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
            Intent i = new Intent(SportsHomepage.this, MainActivity.class);
            startActivity(i);
        }else if(id == R.id.exit){
            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}